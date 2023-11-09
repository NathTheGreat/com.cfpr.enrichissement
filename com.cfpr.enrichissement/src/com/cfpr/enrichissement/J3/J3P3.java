package com.cfpr.enrichissement.J3;

import java.util.Scanner;

public class J3P3 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez un nombre: ";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre=saisirClavier(),result=1;
		
		for(int i=1;i<=nombre;i++) {
			result=result*i;
		}
		afficherMessage("La factorielle de "+nombre+ " est "+ result);
	}
	
	public static int saisirClavier() {
		int nombre = 0;
		
		afficherMessage(MSG_DEMANDE);
		
		nombre = lectureClavier.nextInt();
		
		return nombre;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
}
