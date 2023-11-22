package com.cfpr.enrichissement.J4;

import java.util.*;

public class J4P8 {

	static Scanner lectureClavier = new Scanner(System.in);
	static Scanner lectureTp1 = new Scanner(System.in);
	static Scanner lectureTp2 = new Scanner(System.in);
	static Scanner lectureExamen = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tabNom=new String [8];
		int[][] tabNote=new int[8][3];
		remplirNom(tabNom,tabNote);
		
		double[] tabMoyenneEval=calculerMoyenneEval(tabNote);
		double[] tabMoyenneEtu=calculerMoyenneEtu(tabNote);
		
		System.out.println(Arrays.toString(tabNom));
		System.out.println(Arrays.deepToString(tabNote).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		System.out.println(Arrays.toString(tabMoyenneEval));
		System.out.println(Arrays.toString(tabMoyenneEtu));
	}
	
	public static void remplirNom(String[] tab,int[][] tabNote) {
		for(int i=0;i<tab.length;i++) {
			System.out.println("Entrez le nom #"+i);
			tab[i]= lectureClavier.nextLine();
			System.out.println("Entrez la note au TP1 de "+tab[i]);
			tabNote[i][0]=lectureTp1.nextInt();
			System.out.println("Entrez la note au TP2 de "+tab[i]);
			tabNote[i][1]=lectureTp2.nextInt();
			System.out.println("Entrez la note a l'examen de "+tab[i]);
			tabNote[i][2]=lectureExamen.nextInt();
		}
	}
	
	public static double[] calculerMoyenneEval(int[][] tabNote) {
		double[] tabMoyenne=new double[3];
		for(int i=0;i<tabNote.length;i++) {
			tabMoyenne[0] += tabNote[i][0];
		}
		for(int i=0;i<tabNote.length;i++) {
			tabMoyenne[1] += tabNote[i][1];
		}
		for(int i=0;i<tabNote.length;i++) {
			tabMoyenne[2] += tabNote[i][2];
		}
		tabMoyenne[0]=tabMoyenne[0]/8;
		tabMoyenne[1]=tabMoyenne[1]/8;
		tabMoyenne[2]=tabMoyenne[2]/8;
		
		return tabMoyenne;
	}
	
	public static double[] calculerMoyenneEtu(int[][] tabNote) {
		double[] tabMoyenne=new double[8];
		for(int i=0;i<tabNote[0].length;i++) {
			tabMoyenne[0] += tabNote[0][i];
		}
		for(int i=0;i<tabNote[1].length;i++) {
			tabMoyenne[1] += tabNote[1][i];
		}
		for(int i=0;i<tabNote[2].length;i++) {
			tabMoyenne[2] += tabNote[2][i];
		}
		for(int i=0;i<tabNote[3].length;i++) {
			tabMoyenne[3] += tabNote[3][i];
		}
		for(int i=0;i<tabNote[4].length;i++) {
			tabMoyenne[4] += tabNote[4][i];
		}
		for(int i=0;i<tabNote[5].length;i++) {
			tabMoyenne[5] += tabNote[5][i];
		}
		for(int i=0;i<tabNote[6].length;i++) {
			tabMoyenne[6] += tabNote[6][i];
		}
		for(int i=0;i<tabNote[7].length;i++) {
			tabMoyenne[7] += tabNote[7][i];
		}
		for(int i=0;i<tabMoyenne.length;i++) {
			tabMoyenne[i]=tabMoyenne[i]/3;
			Math.round(tabMoyenne[i]);
		}
		
		return tabMoyenne;
	}
	

}
