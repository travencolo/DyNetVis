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

package visualizationbasics.color;

/**
 *
 * @author PC
 */
public class BlueToCyanScale extends ColorScale {

    /** Creates a new instance of GrayCS */
    public BlueToCyanScale() {
        colors = new java.awt.Color[256];
        colors[  0] = new java.awt.Color(0, 0, 0);
        colors[  1] = new java.awt.Color(0, 0, 40);
        colors[  2] = new java.awt.Color(0, 4, 56);
        colors[  3] = new java.awt.Color(0, 9, 61);
        colors[  4] = new java.awt.Color(0, 12, 64);
        colors[  5] = new java.awt.Color(0, 14, 66);
        colors[  6] = new java.awt.Color(0, 17, 69);
        colors[  7] = new java.awt.Color(0, 20, 73);
        colors[  8] = new java.awt.Color(0, 22, 74);
        colors[  9] = new java.awt.Color(0, 25, 78);
        colors[ 10] = new java.awt.Color(0, 27, 79);
        colors[ 11] = new java.awt.Color(0, 30, 83);
        colors[ 12] = new java.awt.Color(0, 31, 85);
        colors[ 13] = new java.awt.Color(0, 33, 86);
        colors[ 14] = new java.awt.Color(0, 36, 90);
        colors[ 15] = new java.awt.Color(0, 38, 91);
        colors[ 16] = new java.awt.Color(0, 39, 93);
        colors[ 17] = new java.awt.Color(0, 41, 95);
        colors[ 18] = new java.awt.Color(0, 43, 96);
        colors[ 19] = new java.awt.Color(0, 46, 100);
        colors[ 20] = new java.awt.Color(0, 47, 102);
        colors[ 21] = new java.awt.Color(0, 49, 103);
        colors[ 22] = new java.awt.Color(0, 51, 105);
        colors[ 23] = new java.awt.Color(0, 52, 107);
        colors[ 24] = new java.awt.Color(0, 54, 108);
        colors[ 25] = new java.awt.Color(0, 55, 110);
        colors[ 26] = new java.awt.Color(0, 57, 112);
        colors[ 27] = new java.awt.Color(0, 57, 112);
        colors[ 28] = new java.awt.Color(0, 58, 113);
        colors[ 29] = new java.awt.Color(0, 60, 115);
        colors[ 30] = new java.awt.Color(0, 62, 117);
        colors[ 31] = new java.awt.Color(0, 63, 119);
        colors[ 32] = new java.awt.Color(0, 65, 120);
        colors[ 33] = new java.awt.Color(0, 66, 122);
        colors[ 34] = new java.awt.Color(0, 68, 124);
        colors[ 35] = new java.awt.Color(0, 70, 125);
        colors[ 36] = new java.awt.Color(0, 71, 127);
        colors[ 37] = new java.awt.Color(0, 73, 129);
        colors[ 38] = new java.awt.Color(0, 73, 129);
        colors[ 39] = new java.awt.Color(0, 74, 130);
        colors[ 40] = new java.awt.Color(0, 76, 132);
        colors[ 41] = new java.awt.Color(0, 78, 134);
        colors[ 42] = new java.awt.Color(0, 79, 136);
        colors[ 43] = new java.awt.Color(0, 81, 137);
        colors[ 44] = new java.awt.Color(0, 82, 139);
        colors[ 45] = new java.awt.Color(0, 84, 141);
        colors[ 46] = new java.awt.Color(0, 86, 142);
        colors[ 47] = new java.awt.Color(0, 87, 144);
        colors[ 48] = new java.awt.Color(0, 89, 146);
        colors[ 49] = new java.awt.Color(0, 90, 147);
        colors[ 50] = new java.awt.Color(0, 92, 149);
        colors[ 51] = new java.awt.Color(0, 94, 151);
        colors[ 52] = new java.awt.Color(0, 94, 151);
        colors[ 53] = new java.awt.Color(0, 95, 153);
        colors[ 54] = new java.awt.Color(0, 97, 154);
        colors[ 55] = new java.awt.Color(0, 98, 156);
        colors[ 56] = new java.awt.Color(0, 100, 158);
        colors[ 57] = new java.awt.Color(0, 102, 159);
        colors[ 58] = new java.awt.Color(0, 103, 161);
        colors[ 59] = new java.awt.Color(0, 105, 163);
        colors[ 60] = new java.awt.Color(0, 106, 164);
        colors[ 61] = new java.awt.Color(0, 108, 166);
        colors[ 62] = new java.awt.Color(0, 109, 168);
        colors[ 63] = new java.awt.Color(0, 111, 170);
        colors[ 64] = new java.awt.Color(0, 113, 171);
        colors[ 65] = new java.awt.Color(0, 114, 173);
        colors[ 66] = new java.awt.Color(0, 116, 175);
        colors[ 67] = new java.awt.Color(0, 117, 176);
        colors[ 68] = new java.awt.Color(0, 119, 178);
        colors[ 69] = new java.awt.Color(0, 121, 180);
        colors[ 70] = new java.awt.Color(0, 121, 180);
        colors[ 71] = new java.awt.Color(0, 122, 181);
        colors[ 72] = new java.awt.Color(0, 124, 183);
        colors[ 73] = new java.awt.Color(0, 125, 185);
        colors[ 74] = new java.awt.Color(0, 127, 187);
        colors[ 75] = new java.awt.Color(0, 129, 188);
        colors[ 76] = new java.awt.Color(0, 130, 190);
        colors[ 77] = new java.awt.Color(0, 132, 192);
        colors[ 78] = new java.awt.Color(0, 133, 193);
        colors[ 79] = new java.awt.Color(0, 135, 195);
        colors[ 80] = new java.awt.Color(0, 137, 197);
        colors[ 81] = new java.awt.Color(0, 138, 198);
        colors[ 82] = new java.awt.Color(0, 140, 200);
        colors[ 83] = new java.awt.Color(0, 141, 202);
        colors[ 84] = new java.awt.Color(0, 143, 204);
        colors[ 85] = new java.awt.Color(0, 143, 204);
        colors[ 86] = new java.awt.Color(0, 145, 205);
        colors[ 87] = new java.awt.Color(0, 146, 207);
        colors[ 88] = new java.awt.Color(0, 148, 209);
        colors[ 89] = new java.awt.Color(0, 149, 210);
        colors[ 90] = new java.awt.Color(0, 151, 212);
        colors[ 91] = new java.awt.Color(0, 153, 214);
        colors[ 92] = new java.awt.Color(0, 154, 215);
        colors[ 93] = new java.awt.Color(0, 156, 217);
        colors[ 94] = new java.awt.Color(0, 157, 219);
        colors[ 95] = new java.awt.Color(0, 159, 221);
        colors[ 96] = new java.awt.Color(0, 160, 222);
        colors[ 97] = new java.awt.Color(0, 160, 222);
        colors[ 98] = new java.awt.Color(0, 162, 224);
        colors[ 99] = new java.awt.Color(0, 164, 226);
        colors[100] = new java.awt.Color(0, 165, 227);
        colors[101] = new java.awt.Color(0, 167, 229);
        colors[102] = new java.awt.Color(0, 168, 231);
        colors[103] = new java.awt.Color(0, 170, 232);
        colors[104] = new java.awt.Color(0, 172, 234);
        colors[105] = new java.awt.Color(0, 173, 236);
        colors[106] = new java.awt.Color(0, 175, 238);
        colors[107] = new java.awt.Color(0, 175, 238);
        colors[108] = new java.awt.Color(0, 176, 239);
        colors[109] = new java.awt.Color(0, 178, 241);
        colors[110] = new java.awt.Color(0, 180, 243);
        colors[111] = new java.awt.Color(0, 181, 244);
        colors[112] = new java.awt.Color(0, 183, 246);
        colors[113] = new java.awt.Color(2, 184, 248);
        colors[114] = new java.awt.Color(4, 186, 249);
        colors[115] = new java.awt.Color(4, 186, 249);
        colors[116] = new java.awt.Color(4, 186, 249);
        colors[117] = new java.awt.Color(6, 188, 251);
        colors[118] = new java.awt.Color(6, 188, 251);
        colors[119] = new java.awt.Color(9, 189, 253);
        colors[120] = new java.awt.Color(9, 189, 253);
        colors[121] = new java.awt.Color(11, 191, 255);
        colors[122] = new java.awt.Color(11, 191, 255);
        colors[123] = new java.awt.Color(13, 192, 255);
        colors[124] = new java.awt.Color(13, 192, 255);
        colors[125] = new java.awt.Color(13, 192, 255);
        colors[126] = new java.awt.Color(16, 194, 255);
        colors[127] = new java.awt.Color(18, 196, 255);
        colors[128] = new java.awt.Color(20, 197, 255);
        colors[129] = new java.awt.Color(20, 197, 255);
        colors[130] = new java.awt.Color(23, 199, 255);
        colors[131] = new java.awt.Color(25, 200, 255);
        colors[132] = new java.awt.Color(27, 202, 255);
        colors[133] = new java.awt.Color(30, 204, 255);
        colors[134] = new java.awt.Color(32, 205, 255);
        colors[135] = new java.awt.Color(34, 207, 255);
        colors[136] = new java.awt.Color(37, 208, 255);
        colors[137] = new java.awt.Color(37, 208, 255);
        colors[138] = new java.awt.Color(39, 210, 255);
        colors[139] = new java.awt.Color(41, 211, 255);
        colors[140] = new java.awt.Color(44, 213, 255);
        colors[141] = new java.awt.Color(46, 215, 255);
        colors[142] = new java.awt.Color(48, 216, 255);
        colors[143] = new java.awt.Color(51, 218, 255);
        colors[144] = new java.awt.Color(53, 219, 255);
        colors[145] = new java.awt.Color(53, 219, 255);
        colors[146] = new java.awt.Color(55, 221, 255);
        colors[147] = new java.awt.Color(57, 223, 255);
        colors[148] = new java.awt.Color(60, 224, 255);
        colors[149] = new java.awt.Color(62, 226, 255);
        colors[150] = new java.awt.Color(64, 227, 255);
        colors[151] = new java.awt.Color(67, 229, 255);
        colors[152] = new java.awt.Color(67, 229, 255);
        colors[153] = new java.awt.Color(69, 231, 255);
        colors[154] = new java.awt.Color(71, 232, 255);
        colors[155] = new java.awt.Color(74, 234, 255);
        colors[156] = new java.awt.Color(76, 235, 255);
        colors[157] = new java.awt.Color(78, 237, 255);
        colors[158] = new java.awt.Color(81, 239, 255);
        colors[159] = new java.awt.Color(81, 239, 255);
        colors[160] = new java.awt.Color(83, 240, 255);
        colors[161] = new java.awt.Color(85, 242, 255);
        colors[162] = new java.awt.Color(88, 243, 255);
        colors[163] = new java.awt.Color(90, 245, 255);
        colors[164] = new java.awt.Color(92, 247, 255);
        colors[165] = new java.awt.Color(95, 248, 255);
        colors[166] = new java.awt.Color(95, 248, 255);
        colors[167] = new java.awt.Color(97, 250, 255);
        colors[168] = new java.awt.Color(99, 251, 255);
        colors[169] = new java.awt.Color(102, 253, 255);
        colors[170] = new java.awt.Color(104, 255, 255);
        colors[171] = new java.awt.Color(106, 255, 255);
        colors[172] = new java.awt.Color(106, 255, 255);
        colors[173] = new java.awt.Color(108, 255, 255);
        colors[174] = new java.awt.Color(111, 255, 255);
        colors[175] = new java.awt.Color(113, 255, 255);
        colors[176] = new java.awt.Color(115, 255, 255);
        colors[177] = new java.awt.Color(115, 255, 255);
        colors[178] = new java.awt.Color(118, 255, 255);
        colors[179] = new java.awt.Color(120, 255, 255);
        colors[180] = new java.awt.Color(122, 255, 255);
        colors[181] = new java.awt.Color(122, 255, 255);
        colors[182] = new java.awt.Color(125, 255, 255);
        colors[183] = new java.awt.Color(127, 255, 255);
        colors[184] = new java.awt.Color(129, 255, 255);
        colors[185] = new java.awt.Color(129, 255, 255);
        colors[186] = new java.awt.Color(132, 255, 255);
        colors[187] = new java.awt.Color(134, 255, 255);
        colors[188] = new java.awt.Color(136, 255, 255);
        colors[189] = new java.awt.Color(136, 255, 255);
        colors[190] = new java.awt.Color(139, 255, 255);
        colors[191] = new java.awt.Color(141, 255, 255);
        colors[192] = new java.awt.Color(143, 255, 255);
        colors[193] = new java.awt.Color(143, 255, 255);
        colors[194] = new java.awt.Color(146, 255, 255);
        colors[195] = new java.awt.Color(148, 255, 255);
        colors[196] = new java.awt.Color(150, 255, 255);
        colors[197] = new java.awt.Color(150, 255, 255);
        colors[198] = new java.awt.Color(153, 255, 255);
        colors[199] = new java.awt.Color(155, 255, 255);
        colors[200] = new java.awt.Color(155, 255, 255);
        colors[201] = new java.awt.Color(157, 255, 255);
        colors[202] = new java.awt.Color(159, 255, 255);
        colors[203] = new java.awt.Color(159, 255, 255);
        colors[204] = new java.awt.Color(162, 255, 255);
        colors[205] = new java.awt.Color(164, 255, 255);
        colors[206] = new java.awt.Color(164, 255, 255);
        colors[207] = new java.awt.Color(166, 255, 255);
        colors[208] = new java.awt.Color(169, 255, 255);
        colors[209] = new java.awt.Color(171, 255, 255);
        colors[210] = new java.awt.Color(171, 255, 255);
        colors[211] = new java.awt.Color(173, 255, 255);
        colors[212] = new java.awt.Color(176, 255, 255);
        colors[213] = new java.awt.Color(176, 255, 255);
        colors[214] = new java.awt.Color(178, 255, 255);
        colors[215] = new java.awt.Color(180, 255, 255);
        colors[216] = new java.awt.Color(180, 255, 255);
        colors[217] = new java.awt.Color(183, 255, 255);
        colors[218] = new java.awt.Color(185, 255, 255);
        colors[219] = new java.awt.Color(185, 255, 255);
        colors[220] = new java.awt.Color(187, 255, 255);
        colors[221] = new java.awt.Color(190, 255, 255);
        colors[222] = new java.awt.Color(190, 255, 255);
        colors[223] = new java.awt.Color(192, 255, 255);
        colors[224] = new java.awt.Color(194, 255, 255);
        colors[225] = new java.awt.Color(197, 255, 255);
        colors[226] = new java.awt.Color(197, 255, 255);
        colors[227] = new java.awt.Color(199, 255, 255);
        colors[228] = new java.awt.Color(201, 255, 255);
        colors[229] = new java.awt.Color(204, 255, 255);
        colors[230] = new java.awt.Color(204, 255, 255);
        colors[231] = new java.awt.Color(206, 255, 255);
        colors[232] = new java.awt.Color(208, 255, 255);
        colors[233] = new java.awt.Color(210, 255, 255);
        colors[234] = new java.awt.Color(210, 255, 255);
        colors[235] = new java.awt.Color(213, 255, 255);
        colors[236] = new java.awt.Color(215, 255, 255);
        colors[237] = new java.awt.Color(217, 255, 255);
        colors[238] = new java.awt.Color(217, 255, 255);
        colors[239] = new java.awt.Color(220, 255, 255);
        colors[240] = new java.awt.Color(222, 255, 255);
        colors[241] = new java.awt.Color(224, 255, 255);
        colors[242] = new java.awt.Color(227, 255, 255);
        colors[243] = new java.awt.Color(229, 255, 255);
        colors[244] = new java.awt.Color(229, 255, 255);
        colors[245] = new java.awt.Color(231, 255, 255);
        colors[246] = new java.awt.Color(234, 255, 255);
        colors[247] = new java.awt.Color(236, 255, 255);
        colors[248] = new java.awt.Color(238, 255, 255);
        colors[249] = new java.awt.Color(241, 255, 255);
        colors[250] = new java.awt.Color(243, 255, 255);
        colors[251] = new java.awt.Color(243, 255, 255);
        colors[252] = new java.awt.Color(245, 255, 255);
        colors[253] = new java.awt.Color(248, 255, 255);
        colors[254] = new java.awt.Color(250, 255, 255);
        colors[255] = new java.awt.Color(255, 255, 255);
    }
}
