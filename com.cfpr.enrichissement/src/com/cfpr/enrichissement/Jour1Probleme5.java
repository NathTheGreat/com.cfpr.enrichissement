package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1Probleme5 {

	static Scanner lectureClavier = new Scanner(System.in);
	static final String MSG_SAISIR = "Quel est votre montant ?";
	static final String MSG_RESULTAT ="Votre montant apres rabais est de ";
	static final String MSG_TERMINER = "Merci d'avoir utiliser le programme";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double montant,montantRabais;
		
		montant= lireMontant();
		montantRabais=calculerRabais(montant);
		afficherMessage(MSG_RESULTAT+montantRabais);
		terminerProgramme();
		
	}
	
	public static int lireMontant() {
		int note = 0;
		
		afficherMessage(MSG_SAISIR);
		
		note = lectureClavier.nextInt();
		
		return note;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
		
	}
	
	public static double calculerRabais(double montant) {
		double montantRabais;
		
		montantRabais= montant* 0.75;
		
		return montantRabais;
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
		afficherMessage(MSG_TERMINER);
	}

}
