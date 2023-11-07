package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1 {

	static final String MES_HELLO = "Hello",
						MES_DEMANDER_NOM = "Quel est ton nom ?";
	
	static String nomUtilisateur = "";
	static Scanner lectureClavier = new Scanner(System.in);
	static final String MSG_TERMINER = "Merci d'avoir utiliser le programme";
	
	
	public static void main(String[] args) {
		afficherMessage(MES_DEMANDER_NOM);
		nomUtilisateur = saisirClavier();
		afficherMessage(MES_HELLO + " " + nomUtilisateur);
	}

	public static void afficherMessage(String message) {
		System.out.println(message);
		
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
		
	}
	
	public static String saisirClavier() {
		String nom = "";
		
		Scanner lectureClavier = new Scanner(System.in);
		nom = lectureClavier.nextLine();
		lectureClavier.close();
		
		return nom;
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
		afficherMessage(MSG_TERMINER);
	}
	
}
