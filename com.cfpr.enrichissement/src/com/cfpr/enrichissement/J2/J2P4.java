package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P4 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez un nombre: ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre;
		do{
			nombre = saisirClavier();
		}while(nombre < 0 || nombre > 100);
		
	}
	
	public static int saisirClavier() {
		int nombre = 0;
		
		afficherMessage(MSG_DEMANDE);
		
		nombre = lectureClavier.nextInt();
		
		return nombre;
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}

}
