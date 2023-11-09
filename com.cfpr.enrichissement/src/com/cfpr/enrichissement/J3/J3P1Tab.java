package com.cfpr.enrichissement.J3;

import java.util.Arrays;
import java.util.Scanner;

public class J3P1Tab {

	public static Scanner lectureClavier = new Scanner(System.in);
	public static final String MSG_DEMANDE= "Entrez le mot numero ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] tab= new String[5];
		tab =faireBoucle(tab);
		afficherMessage(tab);
		
	}
	
	public static String[] faireBoucle(String[] tab) {
		for(int i=0;i<tab.length;i++) {
			
			afficherMessage(MSG_DEMANDE + i);
			tab[i]=lireClavier();
		}
		
		return tab;
	}
	
	public static String lireClavier() {
		String mots="";
		
		mots = lectureClavier.nextLine();
		
		return mots;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(String[] message) {
		System.out.println(Arrays.toString(message));
	}

}
