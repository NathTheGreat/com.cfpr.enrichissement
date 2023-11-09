package com.cfpr.enrichissement.J3;

import java.util.Arrays;
import java.util.Scanner;

public class J3P2Tab {

	public static Scanner lectureClavier = new Scanner(System.in);
	public static final String MSG_DEMANDE= "Entrez le numero # ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab= new int[10];
		tab =faireBoucle(tab);
		afficherMessage(tab);
		
	}
	
	public static int[] faireBoucle(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			
			afficherMessage(MSG_DEMANDE + i);
			tab[i]=lireClavier();
		}
		
		return tab;
	}
	
	public static int lireClavier() {
		int mots=0;
		
		mots = lectureClavier.nextInt();
		
		return mots;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(int[] message) {
		System.out.println(Arrays.toString(message));
	}


}
