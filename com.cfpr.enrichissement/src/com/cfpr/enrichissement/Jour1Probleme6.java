package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1Probleme6 {

	static Scanner lectureClavier = new Scanner(System.in);
	static final String MSG_SAISIR = "Quel est votre choix de bois ? (1-Chene 2-Erable 3-Pin)";
	static final String MSG_CHENE = "Vous avez choisi le chene";
	static final String MSG_ERABLE = "Vous avez choisi le erable";
	static final String MSG_PIN = "Vous avez choisi le pin";
	static final String MSG_DEFAULT = "Ceci n'est pas un choix";
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bois;
		
		bois=lireBois();
		choisirBois(bois);
		Jour1Probleme4.terminerProgramme();
	}

	public static int lireBois() {
		int bois = 0;
		
		Jour1Probleme4.afficherMessage(MSG_SAISIR);
		
		bois = lectureClavier.nextInt();
		
		return bois;
	}
	
	
	
	public static void choisirBois(int bois) {
		switch(bois) {
		case 1:
			Jour1.afficherMessage(MSG_CHENE);
			break;
		case 2:
			Jour1.afficherMessage(MSG_ERABLE);
			break;
		case 3:
			Jour1.afficherMessage(MSG_PIN);
			break;
		default:
			Jour1.afficherMessage(MSG_DEFAULT);
		}
	}
}
