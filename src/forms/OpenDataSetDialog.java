/* ***** BEGIN LICENSE BLOCK *****
 *
 * Copyright (c) 2014-2019 Bruno Augusto Nassif Travencolo.
 * All Rights Reserved.
 *
 * This file is part of DyNetVis Project (DyNetVis).
 *
 * How to cite this software:
 *  
@inproceedings{Linhares:2017:DSV:3019612.3019686,
 author = {Linhares, Claudio D. G. and Traven\c{c}olo, Bruno A. N. and Paiva, Jose Gustavo S. and Rocha, Luis E. C.},
 title = {DyNetVis: A System for Visualization of Dynamic Networks},
 booktitle = {Proceedings of the Symposium on Applied Computing},
 series = {SAC '17},
 year = {2017},
 isbn = {978-1-4503-4486-9},
 location = {Marrakech, Morocco},
 pages = {187--194},
 numpages = {8},
 url = {http://doi.acm.org/10.1145/3019612.3019686},
 doi = {10.1145/3019612.3019686},
 acmid = {3019686},
 publisher = {ACM},
 address = {New York, NY, USA},
 keywords = {complex networks, dynamic graph visualization, dynamic networks, recurrent neighbors, temporal activity map},
} 
 *  
 * DyNetVis is free software: you can redistribute it and/or modify it under 
 * the terms of the GNU General Public License as published by the Free 
 * Software Foundation, either version 3 of the License, or (at your option) 
 * any later version.
 *
 * DyNetVis is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 * for more details.
 *
 * This code was developed by members of Lab of Complex Network Visualization at 
 * Federal University of Uberlândia, Brazil - (https://sites.google.com/view/dynetvis/team?authuser=0). 
 * The initial developer of the original code is Claudio D. G. Linhares <claudiodgl@gmail.com>.
 *
 * Contributor(s): Jean R. Ponciano -- jeanrobertop@gmail.com, Luis E. C. Rocha -- luis.rocha@ugent.be, 
 * José Gustavo S. Paiva -- gustavo@ufu.br, Bruno A. N. Travençolo -- travencolo@gmail.com
 *
 * You should have received a copy of the GNU General Public License along 
 * with DyNetVis. If not, see <http://www.gnu.org/licenses/>.
 *
 * ***** END LICENSE BLOCK ***** */

package forms;

import com.mxgraph.view.mxGraphView;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;
import layout.NetLayout;
import layout.NetLayoutInlineNew;
import layout.NetLayoutMatrix;					  
import randomNetworks.TemporalBarabasiAlbertModel;


/**
 *
 * @author Claudio Linhares
 */
public class OpenDataSetDialog extends JDialog {
    
    public JDialog  f;
    public JProgressBar progressBar;
    
    public OpenDataSetDialog(MainForm t) {
        
        super(t);
            
        initComponents();
        this.setModal(true);
        this.frame = t;
        
        f = new JDialog();
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Container content = f.getContentPane();
        
        this.f.getRootPane().setOpaque(false);
        //this.f.getContentPane().setBackground(t.strong);
        //this.f.setBackground(t.strong);
        
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        Border border = BorderFactory.createTitledBorder("Reading...");
        progressBar.setBorder(border);
        content.add(progressBar, BorderLayout.NORTH);
        f.setSize(300, 100);
        f.setModal(true);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setResizable(false);
        f.setLocationRelativeTo(this);
        f.setVisible(false);

        generateBarabasiAlbertModel = new GenerateBarabasiAlbertModel(this);
        
        JSpinner.DefaultEditor spinnerEditor = (JSpinner.DefaultEditor) resolutionSpinner.getEditor();
        spinnerEditor.getTextField().setHorizontalAlignment(JTextField.LEFT);
        

        //HIDE Funcionalities that are not ready - to publish
        /*
        */
        formCombo1.removeItemAt(5);
        formCombo1.removeItemAt(4);
        formCombo1.removeItemAt(3);
        formCombo1.removeItemAt(2);
        //jPanel4.setRows(1);
        //jPanel4.setPreferredSize(new Dimension(450,70));
    }
    
    public String text, urlFile;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        formCombo1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        sourcePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        openFileTemporalNetwork = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        pointsTextField = new javax.swing.JTextField();
        pointsButton = new javax.swing.JButton();
        openRandomNetwork = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        modelGenerateNetwork = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        minimumTime = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        maximumTime = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        resolutionSpinner = new javax.swing.JSpinner();
        buttonPanel1 = new javax.swing.JPanel();
        OKButton1 = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(490, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 800));
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 50));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setVerifyInputWhenFocusTarget(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Select the layout:");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel23);

        formCombo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        formCombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Temporal and Structural", "Matrix", "Stream", "Community", "Robots", "Centrality" }));
        formCombo1.setMaximumSize(null);
        formCombo1.setName(""); // NOI18N
        formCombo1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                formCombo1ItemStateChanged(evt);
            }
        });
        formCombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formCombo1MouseClicked(evt);
            }
        });
        formCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formCombo1ActionPerformed(evt);
            }
        });
        jPanel3.add(formCombo1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconInfo.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(0);
        jButton4.setMargin(null);
        jButton4.setOpaque(false);
        jButton4.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        getContentPane().add(jPanel3);

        sourcePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sourcePanel.setMinimumSize(new java.awt.Dimension(400, 200));
        sourcePanel.setPreferredSize(new java.awt.Dimension(450, 170));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Choose between open a Temporal Network or generate a Random Network:");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel6.setPreferredSize(new java.awt.Dimension(440, 30));
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        sourcePanel.add(jLabel6);

        buttonGroup1.add(openFileTemporalNetwork);
        openFileTemporalNetwork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        openFileTemporalNetwork.setText("Temporal Network");
        openFileTemporalNetwork.setPreferredSize(new java.awt.Dimension(440, 23));
        openFileTemporalNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileTemporalNetworkActionPerformed(evt);
            }
        });
        sourcePanel.add(openFileTemporalNetwork);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Select File:");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setEnabled(false);
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(null);
        sourcePanel.add(jLabel1);

        pointsTextField.setEditable(false);
        pointsTextField.setBackground(new java.awt.Color(255, 255, 255));
        pointsTextField.setColumns(25);
        pointsTextField.setEnabled(false);
        pointsTextField.setMaximumSize(null);
        pointsTextField.setMinimumSize(null);
        pointsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsTextFieldActionPerformed(evt);
            }
        });
        sourcePanel.add(pointsTextField);

        pointsButton.setText("Search...");
        pointsButton.setEnabled(false);
        pointsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsButtonActionPerformed(evt);
            }
        });
        sourcePanel.add(pointsButton);

        buttonGroup1.add(openRandomNetwork);
        openRandomNetwork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        openRandomNetwork.setText("Random Network");
        openRandomNetwork.setPreferredSize(new java.awt.Dimension(440, 23));
        openRandomNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openRandomNetworkActionPerformed(evt);
            }
        });
        sourcePanel.add(openRandomNetwork);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Select model:");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.setEnabled(false);
        sourcePanel.add(jLabel24);

        modelGenerateNetwork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modelGenerateNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Barabási-Albert" }));
        modelGenerateNetwork.setEnabled(false);
        modelGenerateNetwork.setMaximumSize(null);
        modelGenerateNetwork.setMinimumSize(null);
        modelGenerateNetwork.setName(""); // NOI18N
        modelGenerateNetwork.setPreferredSize(null);
        modelGenerateNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modelGenerateNetworkItemStateChanged(evt);
            }
        });
        modelGenerateNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelGenerateNetworkMouseClicked(evt);
            }
        });
        modelGenerateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelGenerateNetworkActionPerformed(evt);
            }
        });
        sourcePanel.add(modelGenerateNetwork);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel25.setEnabled(false);
        jLabel25.setPreferredSize(new java.awt.Dimension(195, 20));
        sourcePanel.add(jLabel25);

        getContentPane().add(sourcePanel);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 130));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select Filters:");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setEnabled(false);
        jLabel3.setPreferredSize(new java.awt.Dimension(400, 30));
        jPanel1.add(jLabel3);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Minimum Time");
        jLabel2.setEnabled(false);
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 15));
        jPanel1.add(jLabel2);

        jTextField1.setText("                   ");
        jTextField1.setEnabled(false);
        jTextField1.setMinimumSize(new java.awt.Dimension(10, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jTextField1);

        minimumTime.setValue(0);
        minimumTime.setEnabled(false);
        minimumTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minimumTimeStateChanged(evt);
            }
        });
        jPanel1.add(minimumTime);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Maximum Time");
        jLabel4.setEnabled(false);
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 15));
        jPanel1.add(jLabel4);

        jTextField2.setText("                   ");
        jTextField2.setEnabled(false);
        jTextField2.setMinimumSize(new java.awt.Dimension(10, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jTextField2);

        maximumTime.setValue(100);
        maximumTime.setEnabled(false);
        maximumTime.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maximumTimeStateChanged(evt);
            }
        });
        jPanel1.add(maximumTime);

        jLabel14.setText("                                                                  ");
        jPanel1.add(jLabel14);

        getContentPane().add(jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 60));
        jPanel4.setLayout(new java.awt.GridLayout(2, 0, 2, 2));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Resolution:");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setEnabled(false);
        jLabel10.setPreferredSize(new java.awt.Dimension(430, 30));
        jPanel4.add(jLabel10);

        jLabel15.setText("                                                        ");
        jLabel15.setPreferredSize(new java.awt.Dimension(190, 14));
        jPanel4.add(jLabel15);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Resolution Time");
        jLabel5.setEnabled(false);
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 15));
        jPanel4.add(jLabel5);

        resolutionSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        resolutionSpinner.setEnabled(false);
        resolutionSpinner.setMinimumSize(new java.awt.Dimension(60, 20));
        resolutionSpinner.setPreferredSize(new java.awt.Dimension(100, 20));
        resolutionSpinner.setValue(1);
        resolutionSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                resolutionSpinnerStateChanged(evt);
            }
        });
        jPanel4.add(resolutionSpinner);

        getContentPane().add(jPanel4);

        buttonPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonPanel1.setMinimumSize(new java.awt.Dimension(521, 80));
        buttonPanel1.setPreferredSize(new java.awt.Dimension(450, 40));

        OKButton1.setText("OK");
        OKButton1.setEnabled(false);
        OKButton1.setPreferredSize(new java.awt.Dimension(65, 25));
        OKButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButton1ActionPerformed(evt);
            }
        });
        buttonPanel1.add(OKButton1);

        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });
        buttonPanel1.add(cancelButton1);
        buttonPanel1.add(jPanel2);

        getContentPane().add(buttonPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void pointsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsButtonActionPerformed
        
        JFileChooser openDialog = new JFileChooser();
        String filename = "C:\\Jean\\OneDrive\\StreamingNetworks\\Facebook\\IncrementalLayout\\";
        //String filename = "";
        
        boolean errorFormatFile = false;
        
        openDialog.resetChoosableFileFilters();
        openDialog.setAcceptAllFileFilterUsed(false);
      //  openDialog.setFileFilter(new DATFilter());
        openDialog.setMultiSelectionEnabled(false);
        openDialog.setDialogTitle("Open file");
        
        if(this.lastPath != null){
            filename = this.lastPath;
            
        }
        
        openDialog.setSelectedFile(new File(filename));
        openDialog.setCurrentDirectory(new File(filename));
       
        int result = openDialog.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            filename = openDialog.getSelectedFile().getAbsolutePath();
            urlFile = filename;
            this.lastPath = openDialog.getSelectedFile().getParent();
            
           
            
            this.getPointsTextField().setText(filename);
            openDialog.setSelectedFile(new File(""));
            
            BufferedReader file;
            try {
                file = new BufferedReader(new FileReader(new File(filename)));
                String line = file.readLine();
                
                if(line != null && !line.equals(("")))
                {
                    if(!Character.isDigit(line.charAt(0)))
                        line = file.readLine();
                    String[] tokens = line.split("[ \\t]");
                    if(selectedLayout.equals("Temporal and Structural") || selectedLayout.equals("Matrix"))
                    {
                        if(tokens.length == 3)
                        {
                            boolean isNumber = Pattern.matches("[0-9]+", tokens[2]);
                            if(!isNumber)
                                errorFormatFile = true;
                        }
                        else
                        {
                            errorFormatFile = true;
                        }

                        if(errorFormatFile)
                        {
                            JOptionPane.showMessageDialog(this,"File format different from the expected. Check the Information button for details.","Error",JOptionPane.ERROR_MESSAGE);
                            this.getPointsTextField().setText("");
                        }
                    
                        long menorTempo = Integer.parseInt(tokens[2]);
                        long maiorTempo = menorTempo;

                        String strLine = "";
                        while ((strLine = file.readLine()) != null)
                        {

                           if(!strLine.equals(("")))
                           {
                                if(!Character.isDigit(strLine.charAt(0)))
                                    continue;
                                int tempoLinha = Integer.parseInt(strLine.split("[ \\t]")[2]);
                                if(tempoLinha < menorTempo)
                                    menorTempo = tempoLinha;
                                else if(tempoLinha > maiorTempo)
                                    maiorTempo = tempoLinha;
                           }
                        }


                        this.minimumTime.setValue((int)menorTempo);
                        this.minimumTime.setMaximum((int)maiorTempo);
                        this.maximumTime.setMinimum((int)menorTempo);
                        this.maximumTime.setMaximum((int)maiorTempo);
                        this.maximumTime.setValue((int)maiorTempo);

                        this.resolutionSpinner.setValue(1);
                        
                    }
                    
                    openedNetwork(true);
                    
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            
            
        }
    }//GEN-LAST:event_pointsButtonActionPerformed

    private void pointsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointsTextFieldActionPerformed

    NetLayoutInlineNew netInline = new NetLayoutInlineNew();
    private void OKButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButton1ActionPerformed
          
           Thread t = new Thread() {
          public void run() {
                try {

                    progressBar.setValue(0);
                    
                long tempoInicio = System.currentTimeMillis();
                long tempoAlgoritmo = System.currentTimeMillis();


                HashMap<Integer,Integer> vetorIdNodesNormalizados = new HashMap();
                HashMap<Long,String> matrizRolutos = new HashMap();
                NetLayout net = null;
                
                NetLayoutMatrix netLayoutMatrix = new NetLayoutMatrix();
                if (getPointsTextField().getText().trim().length() > 0 || randomNetworkGeneration)
                {
                    
                    ArrayList<Integer> uniqueIds = new ArrayList();
                    
                    int id = 0;
                    ArrayList<ArrayList> matrizDataInline = new ArrayList<>();
                    if(selectedLayout.equals("Matrix"))
                    {
                        
                        ArrayList<Integer> coluna = new ArrayList<>();
                        BufferedReader file;
                        
                        //Get the filename from URL
                        File filePath = new File(getPointsTextField().getText());
                        

                        try {
                            file = new BufferedReader(new FileReader(filePath));
                            String line;
                            String lastline = "";

                            int idNovo = 0;
                            

                            while((line = file.readLine()) != null) {

                                if(!line.equals(("")))
                                {
                                    if(!Character.isDigit(line.charAt(0)))
                                        continue;
                                }
                                else
                                    continue;
                                String[] tokens = line.split("[ \\t]");

                                if(tokens[0].equals(tokens[1])) //Ignora arestas de um nó pra ele mesmo.
                                    continue;
                                
                                if(!uniqueIds.contains(Integer.parseInt(tokens[0])))
                                    uniqueIds.add(Integer.parseInt(tokens[0]));
                                 if(!uniqueIds.contains(Integer.parseInt(tokens[1])))
                                    uniqueIds.add(Integer.parseInt(tokens[1]));
                                
                                coluna.add(Integer.parseInt(tokens[0]));
                                coluna.add(Integer.parseInt(tokens[1]));

                                if((Integer.parseInt(tokens[2]) >= Integer.parseInt(jTextField1.getText())) && (Integer.parseInt(tokens[2]) <= Integer.parseInt(jTextField2.getText()))){
                                    
                                    int t = Integer.parseInt(tokens[2]) - Integer.parseInt(jTextField1.getText());
                                    tokens[2] = t+"";

                                    if(!resolutionSpinner.getValue().equals("1"))
                                    {
                                        t = (int) Math.floor(Integer.parseInt(tokens[2]) / Integer.parseInt(resolutionSpinner.getValue().toString()));
                                        tokens[2] = t + "";
                                    }
                                    String lineAtual = tokens[0]+" "+tokens[1]+" "+tokens[2];
                                    if(!lastline.equals(lineAtual))
                                    {
                                        coluna.add(Integer.parseInt(tokens[2]));
                                        if(!matrizDataInline.contains(coluna))
                                        {
                                            matrizDataInline.add(id, coluna);
                                            id++;
                                            lastline = lineAtual;
                                        }
                                    }
                                }
                                else
                                    continue;

                                if (!vetorIdNodesNormalizados.containsKey(Integer.parseInt(tokens[0]))) {
                                    vetorIdNodesNormalizados.put(Integer.parseInt(tokens[0]),idNovo);
                                    idNovo++;
                                }
                                if (!vetorIdNodesNormalizados.containsKey(Integer.parseInt(tokens[1]))) {
                                    vetorIdNodesNormalizados.put(Integer.parseInt(tokens[1]),idNovo);
                                    idNovo++;
                                }
                                coluna = new ArrayList<>();
                            }
                            matrizDataInline = ordenaMatriz(matrizDataInline);
                        } catch (FileNotFoundException ex) {
                            System.out.println(ex.getMessage());
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }

                        frame.matrizData = new ArrayList();
                        frame.matrizData.addAll(matrizDataInline);
                        
                        netLayoutMatrix.uniqueIds = uniqueIds.size();
                        netLayoutMatrix.NetLayoutMatrix(matrizDataInline,vetorIdNodesNormalizados);
                        netLayoutMatrix.f = frame;
                        frame.setTitle(getPointsTextField().getText());
                        //netInline.vetorIdNodesNormalizados = vetorIdNodesNormalizados;

                        /*
                        Integer[][] adjacencyMatrix = new Integer[netInline.lineNodes.size()][netInline.lineNodes.size()];
                        for(int i = 0; i < adjacencyMatrix.length; i++)
                        {
                          for(int j = 0; j < adjacencyMatrix.length; j++)
                          {
                              adjacencyMatrix[i][j] = 0;
                          }
                        }

                        for(int i=0; i< matrizDataInline.size();i++)
                        {
                            ArrayList<Integer> matrix = matrizDataInline.get(i);
                            adjacencyMatrix[vetorIdNodesNormalizados.get(matrix.get(0))][vetorIdNodesNormalizados.get(matrix.get(1))] += 1;
                            adjacencyMatrix[vetorIdNodesNormalizados.get(matrix.get(1))][vetorIdNodesNormalizados.get(matrix.get(0))] += 1;
                        }

                        HashMap<Integer, Integer> nodeDegreeByAdjacencyMatrixId = new HashMap();

                        for(int i = 0; i < adjacencyMatrix.length; i++)
                        {
                          Integer sum = 0;
                          for(int j = 0; j < adjacencyMatrix.length; j++)
                          {
                              sum += adjacencyMatrix[i][j];
                          }
                          nodeDegreeByAdjacencyMatrixId.put(i, sum);
                        }

                        netInline.adjacencyMatrix = adjacencyMatrix;
                        netInline.nodeDegreeByAdjacencyMatrixId = nodeDegreeByAdjacencyMatrixId;
                        frame.setNetInline(netInline);
                        */

                        long milliseconds = System.currentTimeMillis() - tempoAlgoritmo;
                        String minutos = String.format("%d min, %d sec", new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(milliseconds)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds))) });

                        progressBar.setValue(50);

                        System.out.println("Tempo para rodar o algoritmo de abrir o arquivo: " + getPointsTextField().getText() + ": " + minutos);

                        frame.setNetLayoutMatrix(netLayoutMatrix);
                        frame.setPathDataset(getPointsTextField().getText());
                        //frame.showHideButtons(true);
                        frame.showHideMatrixButtons(true);
                        frame.jTabbedPane.setEnabledAt(2, true);
                        frame.jTabbedPane.setSelectedIndex(2);
                        text = getPointsTextField().getText();
                        
                        mxGraphView view = frame.vvMatrix.getGraph().getView();
                        double compHei = frame.vvMatrix.getHeight();
                        double viewHei = view.getGraphBounds().getHeight();

                        view.setScale(compHei/viewHei * view.getScale());

                        frame.vvMatrix.repaint();
                        frame.vvMatrix.refresh();


                        progressBar.setValue(99);

                        f.setVisible(false);

                    }
                    else if(selectedLayout.equals("Temporal and Structural"))//Structural and temporal layout
                    {
                        
                        ArrayList<Integer> coluna = new ArrayList<>();
                        BufferedReader file = null;
                        File filePath = null;

                        

                        try {
                            if(!randomNetworkGeneration)
                            {
                                filePath  = new File(getPointsTextField().getText());
                                file = new BufferedReader(new FileReader(filePath));
                            }
                            String line;
                            String lastline = "";

                            int idNovo = 0;
                            
                            ArrayList<String> arestasRede = new ArrayList<>();
                            if(randomNetworkGeneration)
                            {
                                arestasRede = new ArrayList<String>(Arrays.asList(randomNetworkData.split("\r\n")));
                                
                            }
                            Iterator itr = arestasRede.iterator();
                                
                                while(true) {
                                    
                                    if(randomNetworkGeneration && itr.hasNext())
                                        line = itr.next().toString();
                                    else if(!randomNetworkGeneration)
                                    line = file.readLine();
                                    else
                                        break;
                                    
                                    if(line == null)
                                        break;
                                    
                                    if(!line.equals(("")))
                                    {
                                        if(!Character.isDigit(line.charAt(0)))
                                            continue;
                                    }
                                    else
                                        continue;
                                    
                                    coluna = new ArrayList<>();
                                    String[] tokens = line.split("[ \\t]");

                                    if(tokens[0].equals(tokens[1])) //Ignora arestas de um nó pra ele mesmo. Motivo: Não funciona no CNO pois a detecção de comunidade não aceita isso (no layout, esses nós ficam sobrepostos na posição origem)
                                        return;

                                    coluna.add(Integer.parseInt(tokens[0]));
                                    coluna.add(Integer.parseInt(tokens[1]));



                                    if((Integer.parseInt(tokens[2]) >= Integer.parseInt(jTextField1.getText())) && (Integer.parseInt(tokens[2]) <= Integer.parseInt(jTextField2.getText()))){

                                        int t = Integer.parseInt(tokens[2]) - Integer.parseInt(jTextField1.getText());
                                        tokens[2] = t+"";

                                        if(!resolutionSpinner.getValue().equals("1"))
                                        {
                                            t = (int) Math.floor(Integer.parseInt(tokens[2]) / Integer.parseInt(resolutionSpinner.getValue().toString()));
                                            tokens[2] = t + "";

                                        }
                                        String lineAtual = tokens[0]+" "+tokens[1]+" "+tokens[2];
                                        if(!lastline.equals(lineAtual))
                                        {
                                            coluna.add(Integer.parseInt(tokens[2]));
                                            if(!matrizDataInline.contains(coluna))
                                            {
                                                matrizDataInline.add(id, coluna);
                                                id++;
                                                lastline = lineAtual;
                                            }
                                        }
                                    }
                                    else
                                        continue;

                                    if (!vetorIdNodesNormalizados.containsKey(Integer.parseInt(tokens[0]))) {
                                        vetorIdNodesNormalizados.put(Integer.parseInt(tokens[0]),idNovo);
                                        idNovo++;
                                    }
                                    if (!vetorIdNodesNormalizados.containsKey(Integer.parseInt(tokens[1]))) {
                                        vetorIdNodesNormalizados.put(Integer.parseInt(tokens[1]),idNovo);
                                        idNovo++;
                                    }
                                    coluna = new ArrayList<>();
                                    
                                }
                                matrizDataInline = ordenaMatriz(matrizDataInline);
                            } catch (FileNotFoundException ex) {
                                System.out.println(ex.getMessage());
                            } catch (IOException ex) {
                                System.out.println(ex.getMessage());
                            }

                              frame.matrizData = new ArrayList();
                              frame.matrizData.addAll(matrizDataInline);
                              

                              netInline.NetLayoutInlineNew(matrizDataInline, 1, 15,false);
                              netInline.vetorIdNodesNormalizados = vetorIdNodesNormalizados;
                              
                              
                              Integer[][] adjacencyMatrix = new Integer[netInline.lineNodes.size()][netInline.lineNodes.size()];
                              for(int i = 0; i < adjacencyMatrix.length; i++)
                              {
                                for(int j = 0; j < adjacencyMatrix.length; j++)
                                {
                                    adjacencyMatrix[i][j] = 0;
                                }
                              }
                              
                              for(int i=0; i< matrizDataInline.size();i++)
                              {
                                  ArrayList<Integer> matrix = matrizDataInline.get(i);
                                  adjacencyMatrix[vetorIdNodesNormalizados.get(matrix.get(0))][vetorIdNodesNormalizados.get(matrix.get(1))] += 1;
                                  adjacencyMatrix[vetorIdNodesNormalizados.get(matrix.get(1))][vetorIdNodesNormalizados.get(matrix.get(0))] += 1;
                              }
                              
                              HashMap<Integer, Integer> nodeDegreeByAdjacencyMatrixId = new HashMap();
                              
                              for(int i = 0; i < adjacencyMatrix.length; i++)
                              {
                                Integer sum = 0;
                                for(int j = 0; j < adjacencyMatrix.length; j++)
                                {
                                    sum += adjacencyMatrix[i][j];
                                }
                                nodeDegreeByAdjacencyMatrixId.put(i, sum);
                              }
                              
                              netInline.adjacencyMatrix = adjacencyMatrix;
                              netInline.nodeDegreeByAdjacencyMatrixId = nodeDegreeByAdjacencyMatrixId;
                              frame.setNetInline(netInline);

                              long milliseconds = System.currentTimeMillis() - tempoAlgoritmo;
                              String minutos = String.format("%d min, %d sec", new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(milliseconds)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds))) });

                              
                              progressBar.setValue(50);

                              System.out.println("Tempo para rodar o algoritmo de abrir o arquivo: " + getPointsTextField().getText() + ": " + minutos);

                               long tempoVisualizacao = System.currentTimeMillis();

                              net = new NetLayout(getPointsTextField().getText(), netInline.matrizDataInline, frame);
                              net.setResolution(Integer.parseInt(resolutionSpinner.getValue().toString()));
                              //frame.CountOfNetworkResolution.setText(resolutionSpinner.getValue().toString());
                              frame.numberNetworkResolution = resolutionSpinner.getValue().toString();
                              frame.setTitle(getPointsTextField().getText());

                              netInline.maxId = net.maxId;

                              frame.setNetLayoutInline(netInline.graphComponent, netInline.matrizDataInline);

                              frame.nameFile = randomNetworkGeneration ? "Random Generated Network" : filePath.getName().substring(0,filePath.getName().length()-4);
                              //frame.networkNameLabel.setText(frame.nameFile);
                              
                              progressBar.setValue(75);


                              //Line Graph
                             // if(!NetLayoutInlineNew.resolucaoDinamicaRedeEstatica)
                               netInline.NetLayoutLine();

                              //this.frame.setNetLayoutLine(netInline.graphComponentLine);


                              frame.setNetLayout(net);
                              frame.setPathDataset(getPointsTextField().getText());
                              frame.showHideButtons(true);
                              frame.resetFlags();
                              text = getPointsTextField().getText();


                              progressBar.setValue(99);

                              //cf.getRootPane().setOpaque(false);
                              //cf.getContentPane().setBackground(frame.strong);
                              //cf.setBackground(frame.strong);

                              //cf.jPanel1.setBackground(frame.weak);
                              //cf.jPanel2.setBackground(frame.weak);
                              //cf.jPanel4.setBackground(frame.weak);
                              //cf.jPanel6.setBackground(frame.weak);


                              frame.setCf();



                              //cf.display(frame);

                              
                              frame.networkProperties = new NetworkProperties(frame);
                              
                              frame.randomWalkerProperties = new RandomWalker(frame);
                              frame.epidemiologyProcessesProperties = new EpidemiologyProcesses(frame);

                              //frame.orderComboBox.setSelectedIndex(1);
                              frame.orderComboBox.setSelectedIndex(0);
                             
                              frame.setRf(minimumTime.getMaximum(),minimumTime.getMinimum(),minimumTime.getValue(),maximumTime.getValue(),resolutionSpinner.getValue().toString());

                              milliseconds = System.currentTimeMillis() - tempoVisualizacao;
                              minutos = String.format("%d min, %d sec", new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(milliseconds)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds))) });

                              System.out.println("Tempo de visualização de abrir o arquivo: " + getPointsTextField().getText() + ": " + minutos);


                              milliseconds = System.currentTimeMillis() - tempoInicio;
                              minutos = String.format("%d min, %d sec", new Object[] { Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(milliseconds)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds))) });

                              System.out.println("Tempo total de abrir o arquivo: " + getPointsTextField().getText() + ": " + minutos);

                              frame.vv.getGraph().refresh();
                              frame.vv.getGraph().repaint();
                              frame.estruturaGraphInline.getGraph().refresh();
                              frame.estruturaGraphInline.getGraph().repaint();
                              
                              frame.jTabbedPane.setEnabledAt(0, true);
                              frame.jTabbedPane.setEnabledAt(1, true);
                              frame.jTabbedPane.setSelectedIndex(0);
                              
                              f.setVisible(false);

                    }
                }
                else if(!randomNetworkGeneration) //Nenhuma rede gerada
                {
                  JOptionPane.showMessageDialog(null, "A net data set file must be selected.", "Error", 0);
                }

            }
            catch(Exception ex) {
              System.out.println(ex.getMessage());
            }
          }
        };
                  
        t.start();
      
        dispose();
        f.setVisible(true);
      
        if (!t.interrupted()) {
            t.interrupt();
        }
      
        /*
        int id = 0;
            matrizDataInline = new ArrayList<>();
            ArrayList<Integer> coluna = new ArrayList<>();
            deslocamento = 1;  
            shiftX = 30;
            
            while((line = file.readLine()) != null) {
                tokens = line.split(" ");
                coluna.add(Integer.parseInt(tokens[0]));
                coluna.add(Integer.parseInt(tokens[1]));
                coluna.add(Integer.parseInt(tokens[2]));
                matrizDataInline.add(id, coluna);
                coluna = new ArrayList<>();
                id++;
            }
        */
        
    }//GEN-LAST:event_OKButton1ActionPerformed

   
    
    private ArrayList ordenaMatriz(ArrayList matrizDataInline)
    {
        Collections.sort(matrizDataInline, new Comparator<ArrayList>()
                                {
                                    public int compare(ArrayList o1, ArrayList o2)
                                    {

                                            if((int)o1.get(2) < (int)o2.get(2))
                                                return -1;
                                            return 1;

                                    }
                                });
        return matrizDataInline;
    }
    
    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void minimumTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minimumTimeStateChanged
        if(minimumTime.getValue() > maximumTime.getValue())
        {
            maximumTime.setValue(minimumTime.getValue());
        }
        jTextField1.setText(minimumTime.getValue()+"");
        
    }//GEN-LAST:event_minimumTimeStateChanged

    private void maximumTimeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maximumTimeStateChanged
        if(maximumTime.getValue() < minimumTime.getValue())
        {
            minimumTime.setValue(maximumTime.getValue());
        }
        jTextField2.setText(maximumTime.getValue()+"");
    }//GEN-LAST:event_maximumTimeStateChanged

    private void resolutionSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_resolutionSpinnerStateChanged

    }//GEN-LAST:event_resolutionSpinnerStateChanged

    boolean randomNetworkGeneration = false;
    String randomNetworkData = "";
    public TemporalBarabasiAlbertModel t;
    
    public void executeRandomNetworkAlgorithm()
    {
    
        randomNetworkData = t.Execute();
        
        randomNetworkGeneration = true;
        
        if(randomNetworkData == null)
        {
            JOptionPane.showMessageDialog(null, "Network Generation Error.", "Error", 0);
            return;
        }
        
        String[] lines = randomNetworkData.split("\r\n");
        
        long menorTempo = -1;
        long maiorTempo = -1;
        
        for(String line : lines)
        {
        
            if(line != null && !line.equals(("")))
            {
                    if(!Character.isDigit(line.charAt(0)))
                        continue;
                    String[] tokens = line.split("[ \\t]");

                int tempoLinha = Integer.parseInt(tokens[2]);
                if(tempoLinha < menorTempo)
                    menorTempo = tempoLinha;
                else if(tempoLinha > maiorTempo)
                    maiorTempo = tempoLinha;
            }
        }
                
                    
        //   String[] tokensFinal = strLine.split(" ");
        this.minimumTime.setValue((int)menorTempo);
        this.minimumTime.setMaximum((int)maiorTempo);
        this.maximumTime.setMinimum((int)menorTempo);
        this.maximumTime.setMaximum((int)maiorTempo);
        this.maximumTime.setValue((int)maiorTempo);
              /*
                 this.minimumTime.setValue(Integer.parseInt(tokens[2]));
                 this.minimumTime.setMaximum(Integer.parseInt(tokensFinal[2]));
                 this.maximumTime.setMinimum(Integer.parseInt(tokens[2]));
                 this.maximumTime.setMaximum(Integer.parseInt(tokensFinal[2]));
                 this.maximumTime.setValue(Integer.parseInt(tokensFinal[2]));
              */
         this.resolutionSpinner.setValue(1);
         openedNetwork(true);
    }
    
    String selectedLayout = "Temporal and Structural";
    
    private void formCombo1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_formCombo1ItemStateChanged
        selectedLayout = evt.getItem().toString();
    }//GEN-LAST:event_formCombo1ItemStateChanged

    private void formCombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formCombo1MouseClicked
        
    }//GEN-LAST:event_formCombo1MouseClicked

    private void formCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formCombo1ActionPerformed
       openedNetwork(false);
    }//GEN-LAST:event_formCombo1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File("readme.pdf");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                File myFile = new File("readme.txt");
                try {
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex1) {
                    System.out.println(ex1.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void openFileTemporalNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileTemporalNetworkActionPerformed
        showHideFuncionalities(true);
    }//GEN-LAST:event_openFileTemporalNetworkActionPerformed

    private void openRandomNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openRandomNetworkActionPerformed
        showHideFuncionalities(false);
    }//GEN-LAST:event_openRandomNetworkActionPerformed

    public GenerateBarabasiAlbertModel generateBarabasiAlbertModel;
    
    String modelRandomNetworks = "None";
    
    private void modelGenerateNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modelGenerateNetworkItemStateChanged
        modelRandomNetworks = evt.getItem().toString();
    }//GEN-LAST:event_modelGenerateNetworkItemStateChanged

    private void modelGenerateNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelGenerateNetworkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_modelGenerateNetworkMouseClicked

    private void modelGenerateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelGenerateNetworkActionPerformed
        if(modelRandomNetworks.equals("Barabási-Albert"))
        {
            generateBarabasiAlbertModel.display();
        }
        else
        {
            
        }
    }//GEN-LAST:event_modelGenerateNetworkActionPerformed
    
    
    private void showHideFuncionalities(boolean temporalnetwork)
    {
        if(temporalnetwork)
        {
            jLabel1.setEnabled(true);
            pointsTextField.setEnabled(true);
            pointsButton.setEnabled(true);
            
            jLabel24.setEnabled(false);
            modelGenerateNetwork.setEnabled(false);
        }
        else
        {
            jLabel1.setEnabled(false);
            pointsTextField.setEnabled(false);
            pointsButton.setEnabled(false);
            
            jLabel24.setEnabled(true);
            modelGenerateNetwork.setEnabled(true);
        }
    }
    
    private void openedNetwork(boolean state)
    {
        jLabel3.setEnabled(state);
        jLabel2.setEnabled(state);
        jTextField1.setEnabled(state);
        minimumTime.setEnabled(state);
        jLabel4.setEnabled(state);
        jTextField2.setEnabled(state);
        maximumTime.setEnabled(state);
        jLabel10.setEnabled(state);
        jLabel5.setEnabled(state);
        resolutionSpinner.setEnabled(state);
        OKButton1.setEnabled(state);
        if(!state)
            pointsTextField.setText("");
    }
    
    public static OpenDataSetDialog getInstance(MainForm t) {
        if (instance == null || instance.getParent() != t) {
            instance = new OpenDataSetDialog(t);
            
        }
        return instance;
    }

    public void display() {
        this.pack();
        this.setLocationRelativeTo(this.getParent());
        this.setVisible(true);
    }

    private static OpenDataSetDialog instance;
    private MainForm frame;
    private String pathLabelList;
    public String lastPath;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton OKButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JPanel buttonPanel1;
    public javax.swing.JButton cancelButton1;
    protected javax.swing.JComboBox formCombo1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JSlider maximumTime;
    public javax.swing.JSlider minimumTime;
    protected javax.swing.JComboBox modelGenerateNetwork;
    private javax.swing.JRadioButton openFileTemporalNetwork;
    private javax.swing.JRadioButton openRandomNetwork;
    public javax.swing.JButton pointsButton;
    private javax.swing.JTextField pointsTextField;
    private javax.swing.JSpinner resolutionSpinner;
    public javax.swing.JPanel sourcePanel;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the pointsTextField
     */
    public javax.swing.JTextField getPointsTextField() {
        return pointsTextField;
    }

}
