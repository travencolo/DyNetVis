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
public class BlueToYellowScale extends ColorScale {

    /** Creates a new instance of GrayCS */
    public BlueToYellowScale() {
        colors = new java.awt.Color[256];
        colors[  0] = new java.awt.Color(7, 7, 254);
        colors[  1] = new java.awt.Color(23, 23, 252);
        colors[  2] = new java.awt.Color(30, 30, 250);
        colors[  3] = new java.awt.Color(36, 36, 248);
        colors[  4] = new java.awt.Color(40, 40, 247);
        colors[  5] = new java.awt.Color(44, 44, 245);
        colors[  6] = new java.awt.Color(47, 47, 243);
        colors[  7] = new java.awt.Color(50, 50, 242);
        colors[  8] = new java.awt.Color(52, 52, 240);
        colors[  9] = new java.awt.Color(55, 55, 239);
        colors[ 10] = new java.awt.Color(57, 57, 238);
        colors[ 11] = new java.awt.Color(59, 59, 236);
        colors[ 12] = new java.awt.Color(61, 61, 235);
        colors[ 13] = new java.awt.Color(63, 63, 234);
        colors[ 14] = new java.awt.Color(65, 65, 233);
        colors[ 15] = new java.awt.Color(66, 66, 231);
        colors[ 16] = new java.awt.Color(68, 68, 230);
        colors[ 17] = new java.awt.Color(69, 69, 229);
        colors[ 18] = new java.awt.Color(71, 71, 228);
        colors[ 19] = new java.awt.Color(72, 72, 227);
        colors[ 20] = new java.awt.Color(74, 74, 226);
        colors[ 21] = new java.awt.Color(75, 75, 225);
        colors[ 22] = new java.awt.Color(76, 76, 225);
        colors[ 23] = new java.awt.Color(78, 78, 224);
        colors[ 24] = new java.awt.Color(79, 79, 223);
        colors[ 25] = new java.awt.Color(80, 80, 222);
        colors[ 26] = new java.awt.Color(81, 81, 221);
        colors[ 27] = new java.awt.Color(82, 82, 221);
        colors[ 28] = new java.awt.Color(84, 84, 220);
        colors[ 29] = new java.awt.Color(85, 85, 219);
        colors[ 30] = new java.awt.Color(86, 86, 218);
        colors[ 31] = new java.awt.Color(87, 87, 218);
        colors[ 32] = new java.awt.Color(88, 88, 217);
        colors[ 33] = new java.awt.Color(89, 89, 216);
        colors[ 34] = new java.awt.Color(90, 90, 216);
        colors[ 35] = new java.awt.Color(91, 91, 215);
        colors[ 36] = new java.awt.Color(92, 92, 214);
        colors[ 37] = new java.awt.Color(93, 93, 214);
        colors[ 38] = new java.awt.Color(94, 94, 213);
        colors[ 39] = new java.awt.Color(95, 95, 213);
        colors[ 40] = new java.awt.Color(96, 96, 212);
        colors[ 41] = new java.awt.Color(97, 97, 212);
        colors[ 42] = new java.awt.Color(98, 98, 211);
        colors[ 43] = new java.awt.Color(98, 98, 210);
        colors[ 44] = new java.awt.Color(99, 99, 210);
        colors[ 45] = new java.awt.Color(100, 100, 209);
        colors[ 46] = new java.awt.Color(101, 101, 209);
        colors[ 47] = new java.awt.Color(102, 102, 208);
        colors[ 48] = new java.awt.Color(103, 103, 208);
        colors[ 49] = new java.awt.Color(104, 104, 208);
        colors[ 50] = new java.awt.Color(105, 105, 207);
        colors[ 51] = new java.awt.Color(105, 105, 207);
        colors[ 52] = new java.awt.Color(106, 106, 206);
        colors[ 53] = new java.awt.Color(107, 107, 206);
        colors[ 54] = new java.awt.Color(108, 108, 205);
        colors[ 55] = new java.awt.Color(109, 109, 205);
        colors[ 56] = new java.awt.Color(110, 110, 204);
        colors[ 57] = new java.awt.Color(110, 110, 204);
        colors[ 58] = new java.awt.Color(111, 111, 204);
        colors[ 59] = new java.awt.Color(112, 112, 203);
        colors[ 60] = new java.awt.Color(113, 113, 203);
        colors[ 61] = new java.awt.Color(114, 114, 202);
        colors[ 62] = new java.awt.Color(114, 114, 202);
        colors[ 63] = new java.awt.Color(115, 115, 202);
        colors[ 64] = new java.awt.Color(116, 116, 201);
        colors[ 65] = new java.awt.Color(117, 117, 201);
        colors[ 66] = new java.awt.Color(118, 118, 200);
        colors[ 67] = new java.awt.Color(118, 118, 200);
        colors[ 68] = new java.awt.Color(119, 119, 200);
        colors[ 69] = new java.awt.Color(120, 120, 199);
        colors[ 70] = new java.awt.Color(121, 121, 199);
        colors[ 71] = new java.awt.Color(121, 121, 199);
        colors[ 72] = new java.awt.Color(122, 122, 198);
        colors[ 73] = new java.awt.Color(123, 123, 198);
        colors[ 74] = new java.awt.Color(124, 124, 198);
        colors[ 75] = new java.awt.Color(124, 124, 197);
        colors[ 76] = new java.awt.Color(125, 125, 197);
        colors[ 77] = new java.awt.Color(126, 126, 197);
        colors[ 78] = new java.awt.Color(127, 127, 196);
        colors[ 79] = new java.awt.Color(128, 128, 196);
        colors[ 80] = new java.awt.Color(128, 128, 195);
        colors[ 81] = new java.awt.Color(129, 129, 195);
        colors[ 82] = new java.awt.Color(130, 130, 195);
        colors[ 83] = new java.awt.Color(130, 130, 194);
        colors[ 84] = new java.awt.Color(131, 131, 194);
        colors[ 85] = new java.awt.Color(132, 132, 194);
        colors[ 86] = new java.awt.Color(133, 133, 193);
        colors[ 87] = new java.awt.Color(133, 133, 193);
        colors[ 88] = new java.awt.Color(134, 134, 193);
        colors[ 89] = new java.awt.Color(135, 135, 192);
        colors[ 90] = new java.awt.Color(136, 136, 192);
        colors[ 91] = new java.awt.Color(136, 136, 192);
        colors[ 92] = new java.awt.Color(137, 137, 191);
        colors[ 93] = new java.awt.Color(138, 138, 191);
        colors[ 94] = new java.awt.Color(139, 139, 191);
        colors[ 95] = new java.awt.Color(139, 139, 190);
        colors[ 96] = new java.awt.Color(140, 140, 190);
        colors[ 97] = new java.awt.Color(141, 141, 190);
        colors[ 98] = new java.awt.Color(142, 142, 189);
        colors[ 99] = new java.awt.Color(142, 142, 189);
        colors[100] = new java.awt.Color(143, 143, 189);
        colors[101] = new java.awt.Color(144, 144, 188);
        colors[102] = new java.awt.Color(144, 144, 188);
        colors[103] = new java.awt.Color(145, 145, 188);
        colors[104] = new java.awt.Color(146, 146, 187);
        colors[105] = new java.awt.Color(147, 147, 187);
        colors[106] = new java.awt.Color(147, 147, 187);
        colors[107] = new java.awt.Color(148, 148, 186);
        colors[108] = new java.awt.Color(149, 149, 186);
        colors[109] = new java.awt.Color(149, 149, 186);
        colors[110] = new java.awt.Color(150, 150, 185);
        colors[111] = new java.awt.Color(151, 151, 185);
        colors[112] = new java.awt.Color(152, 152, 185);
        colors[113] = new java.awt.Color(152, 152, 184);
        colors[114] = new java.awt.Color(153, 153, 184);
        colors[115] = new java.awt.Color(154, 154, 184);
        colors[116] = new java.awt.Color(154, 154, 183);
        colors[117] = new java.awt.Color(155, 155, 183);
        colors[118] = new java.awt.Color(156, 156, 182);
        colors[119] = new java.awt.Color(157, 157, 182);
        colors[120] = new java.awt.Color(157, 157, 182);
        colors[121] = new java.awt.Color(158, 158, 181);
        colors[122] = new java.awt.Color(159, 159, 181);
        colors[123] = new java.awt.Color(159, 159, 181);
        colors[124] = new java.awt.Color(160, 160, 180);
        colors[125] = new java.awt.Color(161, 161, 180);
        colors[126] = new java.awt.Color(162, 162, 180);
        colors[127] = new java.awt.Color(162, 162, 179);
        colors[128] = new java.awt.Color(163, 163, 179);
        colors[129] = new java.awt.Color(164, 164, 178);
        colors[130] = new java.awt.Color(164, 164, 178);
        colors[131] = new java.awt.Color(165, 165, 178);
        colors[132] = new java.awt.Color(166, 166, 177);
        colors[133] = new java.awt.Color(167, 167, 177);
        colors[134] = new java.awt.Color(167, 167, 176);
        colors[135] = new java.awt.Color(168, 168, 176);
        colors[136] = new java.awt.Color(169, 169, 176);
        colors[137] = new java.awt.Color(169, 169, 175);
        colors[138] = new java.awt.Color(170, 170, 175);
        colors[139] = new java.awt.Color(171, 171, 174);
        colors[140] = new java.awt.Color(172, 172, 174);
        colors[141] = new java.awt.Color(172, 172, 173);
        colors[142] = new java.awt.Color(173, 173, 173);
        colors[143] = new java.awt.Color(174, 174, 173);
        colors[144] = new java.awt.Color(174, 174, 172);
        colors[145] = new java.awt.Color(175, 175, 172);
        colors[146] = new java.awt.Color(176, 176, 171);
        colors[147] = new java.awt.Color(177, 177, 171);
        colors[148] = new java.awt.Color(177, 177, 170);
        colors[149] = new java.awt.Color(178, 178, 170);
        colors[150] = new java.awt.Color(179, 179, 169);
        colors[151] = new java.awt.Color(179, 179, 169);
        colors[152] = new java.awt.Color(180, 180, 168);
        colors[153] = new java.awt.Color(181, 181, 168);
        colors[154] = new java.awt.Color(181, 181, 167);
        colors[155] = new java.awt.Color(182, 182, 167);
        colors[156] = new java.awt.Color(183, 183, 166);
        colors[157] = new java.awt.Color(184, 184, 166);
        colors[158] = new java.awt.Color(184, 184, 165);
        colors[159] = new java.awt.Color(185, 185, 165);
        colors[160] = new java.awt.Color(186, 186, 164);
        colors[161] = new java.awt.Color(186, 186, 164);
        colors[162] = new java.awt.Color(187, 187, 163);
        colors[163] = new java.awt.Color(188, 188, 163);
        colors[164] = new java.awt.Color(189, 189, 162);
        colors[165] = new java.awt.Color(189, 189, 162);
        colors[166] = new java.awt.Color(190, 190, 161);
        colors[167] = new java.awt.Color(191, 191, 161);
        colors[168] = new java.awt.Color(191, 191, 160);
        colors[169] = new java.awt.Color(192, 192, 159);
        colors[170] = new java.awt.Color(193, 193, 159);
        colors[171] = new java.awt.Color(194, 194, 158);
        colors[172] = new java.awt.Color(194, 194, 158);
        colors[173] = new java.awt.Color(195, 195, 157);
        colors[174] = new java.awt.Color(196, 196, 157);
        colors[175] = new java.awt.Color(196, 196, 156);
        colors[176] = new java.awt.Color(197, 197, 155);
        colors[177] = new java.awt.Color(198, 198, 155);
        colors[178] = new java.awt.Color(199, 199, 154);
        colors[179] = new java.awt.Color(199, 199, 153);
        colors[180] = new java.awt.Color(200, 200, 153);
        colors[181] = new java.awt.Color(201, 201, 152);
        colors[182] = new java.awt.Color(201, 201, 151);
        colors[183] = new java.awt.Color(202, 202, 151);
        colors[184] = new java.awt.Color(203, 203, 150);
        colors[185] = new java.awt.Color(204, 204, 149);
        colors[186] = new java.awt.Color(204, 204, 149);
        colors[187] = new java.awt.Color(205, 205, 148);
        colors[188] = new java.awt.Color(206, 206, 147);
        colors[189] = new java.awt.Color(206, 206, 146);
        colors[190] = new java.awt.Color(207, 207, 146);
        colors[191] = new java.awt.Color(208, 208, 145);
        colors[192] = new java.awt.Color(209, 209, 144);
        colors[193] = new java.awt.Color(209, 209, 143);
        colors[194] = new java.awt.Color(210, 210, 143);
        colors[195] = new java.awt.Color(211, 211, 142);
        colors[196] = new java.awt.Color(211, 211, 141);
        colors[197] = new java.awt.Color(212, 212, 140);
        colors[198] = new java.awt.Color(213, 213, 139);
        colors[199] = new java.awt.Color(214, 214, 138);
        colors[200] = new java.awt.Color(214, 214, 138);
        colors[201] = new java.awt.Color(215, 215, 137);
        colors[202] = new java.awt.Color(216, 216, 136);
        colors[203] = new java.awt.Color(216, 216, 135);
        colors[204] = new java.awt.Color(217, 217, 134);
        colors[205] = new java.awt.Color(218, 218, 133);
        colors[206] = new java.awt.Color(219, 219, 132);
        colors[207] = new java.awt.Color(219, 219, 131);
        colors[208] = new java.awt.Color(220, 220, 130);
        colors[209] = new java.awt.Color(221, 221, 129);
        colors[210] = new java.awt.Color(221, 221, 128);
        colors[211] = new java.awt.Color(222, 222, 127);
        colors[212] = new java.awt.Color(223, 223, 126);
        colors[213] = new java.awt.Color(224, 224, 125);
        colors[214] = new java.awt.Color(224, 224, 124);
        colors[215] = new java.awt.Color(225, 225, 123);
        colors[216] = new java.awt.Color(226, 226, 122);
        colors[217] = new java.awt.Color(226, 226, 121);
        colors[218] = new java.awt.Color(227, 227, 119);
        colors[219] = new java.awt.Color(228, 228, 118);
        colors[220] = new java.awt.Color(229, 229, 117);
        colors[221] = new java.awt.Color(229, 229, 116);
        colors[222] = new java.awt.Color(230, 230, 114);
        colors[223] = new java.awt.Color(231, 231, 113);
        colors[224] = new java.awt.Color(232, 232, 112);
        colors[225] = new java.awt.Color(232, 232, 110);
        colors[226] = new java.awt.Color(233, 233, 109);
        colors[227] = new java.awt.Color(234, 234, 107);
        colors[228] = new java.awt.Color(234, 234, 106);
        colors[229] = new java.awt.Color(235, 235, 104);
        colors[230] = new java.awt.Color(236, 236, 103);
        colors[231] = new java.awt.Color(237, 237, 101);
        colors[232] = new java.awt.Color(237, 237, 100);
        colors[233] = new java.awt.Color(238, 238, 98);
        colors[234] = new java.awt.Color(239, 239, 96);
        colors[235] = new java.awt.Color(239, 239, 94);
        colors[236] = new java.awt.Color(240, 240, 92);
        colors[237] = new java.awt.Color(241, 241, 91);
        colors[238] = new java.awt.Color(242, 242, 89);
        colors[239] = new java.awt.Color(242, 242, 86);
        colors[240] = new java.awt.Color(243, 243, 84);
        colors[241] = new java.awt.Color(244, 244, 82);
        colors[242] = new java.awt.Color(245, 245, 80);
        colors[243] = new java.awt.Color(245, 245, 77);
        colors[244] = new java.awt.Color(246, 246, 74);
        colors[245] = new java.awt.Color(247, 247, 72);
        colors[246] = new java.awt.Color(247, 247, 69);
        colors[247] = new java.awt.Color(248, 248, 65);
        colors[248] = new java.awt.Color(249, 249, 62);
        colors[249] = new java.awt.Color(250, 250, 58);
        colors[250] = new java.awt.Color(250, 250, 54);
        colors[251] = new java.awt.Color(251, 251, 49);
        colors[252] = new java.awt.Color(252, 252, 44);
        colors[253] = new java.awt.Color(253, 253, 37);
        colors[254] = new java.awt.Color(253, 253, 28);
        colors[255] = new java.awt.Color(254, 254, 13);
    }
}
