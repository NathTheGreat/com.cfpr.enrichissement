package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P9 {

	
	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez un nombre: ";
	
	public static void main(String[] args) {
		double rayon,circonference;
		
		rayon = saisirClavier();
		circonference = calculerCirconference(rayon);
	}
	
	public static double calculerCirconference(double rayon) {
		double circonference;
		
		circonference= 2*rayon*
		
		return circonference;
	}

	public static double saisirClavier() {
		double rayon = 0;
		
		afficherMessage(MSG_DEMANDE);
		
		rayon = lectureClavier.nextDouble();
		
		return rayon;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
}
