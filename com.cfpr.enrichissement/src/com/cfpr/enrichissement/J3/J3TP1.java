package com.cfpr.enrichissement.J3;

import java.util.Scanner;

public class J3TP1 {

	public static Scanner lectureClavier =new Scanner(System.in);
	public static Scanner menu =new Scanner(System.in);
	public static Scanner jeuRandom =new Scanner(System.in);
	public static final String MSG_ACCEUIL=
			  "TRAVAIL PRATIQUE #1 - Votre Nom\r\n"
			+ "-------------------------------\r\n"
			+ "1) Transformer $$$ en monnaie \r\n"
			+ "2) Jeu trouver un nombre mystère\r\n"
			+ "3) Quitter\r\n"
			+ "Choix :";
	public static final String MSG_FIN="Merci d'avoir utilise notre programme",
							   MSG_PLUSGRAND="le nombre est plus grand",
							   MSG_PLUSPETIT="le nombre est plus petit",
							   MSG_REUSSIT="Bien joue le nombre etait ",
							   MSG_ECHEC="Vous n'avez plus d'essais le nombre etait ",
							   MSG_ACCEUILRANDOM="Bienvenue, entrez un nombre pour commencer";
	
	 public static void main(String[] args) {
		 int choix=0;
		 afficherMessage(MSG_ACCEUIL);
		 choix = lireMenu();
		 
	        switch(choix) {
	        
	        case 1:
	        
	        	System.out.print("Veuillez entrer la somme d'argent positive : ");
	        	double somme = lectureClavier.nextDouble();
	        	calculerBilletsPieces(somme);
	        	terminerProgramme();
	        		
	        	break;
	        	
	        case 2:
	        	jeuRandom();
	        	terminerProgramme();
	        	
	        	break;
	        	
	        case 3:
	        	terminerProgramme();
	        	break;
	        default :
	        	afficherMessage(MSG_ACCEUIL);
	        	break;
	        }
	        
	        
	    }
	 
	public static int lireMenu() {
		int choix = menu.nextInt();
		
		return choix;
	}
	
	public static void calculerBilletsPieces(double somme) {
		// TODO Auto-generated method stub
		
        double[][] billetsPieces = {{100}, {50}, {20}, {10}, {5}, {2}, {1}, {0.25}, {0.10}, {0.05}, {0.01}};
        int[][] quantites = new int[billetsPieces.length][1];

        for (int i = 0; i < billetsPieces.length; i++) {
            quantites[i][0] = (int)  (somme / billetsPieces[i][0]);
            somme -= quantites[i][0] * billetsPieces[i][0];
        }

        for (int i = 0; i < billetsPieces.length; i++) {
            if (quantites[i][0] > 0) {
            System.out.println(quantites[i][0] + " " + billetsPieces[i][0] + " $");
            }
        }
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	

	public static double lireClavier() {
		double argent =0;
		
		argent = lectureClavier.nextDouble();
		
		return argent;
	}
	
	public static void terminerProgramme() {
		menu.close();
		lectureClavier.close();
		afficherMessage(MSG_FIN);
	}
	
	public static void jeuRandom() {
		int nombreR = (int) (Math.random()*21);
		afficherMessage(MSG_ACCEUILRANDOM);
		 for(int i=0;i<7;i++) {
			 int nombre = jeuRandom.nextInt();
			 if(nombre>nombreR) {
				 afficherMessage(MSG_PLUSPETIT);
			 }
			 else if(nombre<nombreR) {
				 afficherMessage(MSG_PLUSGRAND);
			 }
			 else {
					 afficherMessage(MSG_REUSSIT + nombreR);
					 i=10;
				 }
			 }
		 }
	}
	

