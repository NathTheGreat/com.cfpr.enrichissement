package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1Probleme4 {
	
	static Scanner lectureClavierNote = new Scanner(System.in);
	static Scanner lectureClavierMatiere = new Scanner(System.in);
	static final String MSG_SAISIR_NOTE = "Quel est votre note ?";
	static final String MSG_SAISIR_MATIERE = "Quel est votre matiere ?";
	static final String MSG_REUSSITE = "Vous avez passe votre cours de ";
	static final String MSG_ECHEC = "Vous avez echoue votre cours de ";
	static final String MSG_TERMINER = "Merci d'avoir utiliser le programme";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note;
		String matiere= "";
		note = lireNote();
		matiere = lireMatiere();
		
		verifierEchecReussite(note,matiere);
		terminerProgramme();
	}
	
	public static int lireNote() {
		int note = 0;
		
		afficherMessage(MSG_SAISIR_NOTE);
		
		note = lectureClavierNote.nextInt();
		
		return note;
	}
	
	public static String lireMatiere() {
		String matiere = "";
		
		afficherMessage(MSG_SAISIR_MATIERE);
		
		matiere = lectureClavierMatiere.nextLine();
		
		return matiere;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
		
	}
	
	public static void verifierEchecReussite(int note,String matiere) {
		if((note >= 60) && (matiere.equals("Math")) ) {
			afficherMessage(MSG_REUSSITE + matiere);
		}
		else if ((note >= 80) && (matiere.equals("Info"))) {
			afficherMessage(MSG_REUSSITE + matiere);
		}
		else {
			afficherMessage(MSG_ECHEC + matiere);
		}
	}
	
	public static void terminerProgramme() {
		lectureClavierNote.close();
		lectureClavierMatiere.close();
		afficherMessage(MSG_TERMINER);
	}

}
