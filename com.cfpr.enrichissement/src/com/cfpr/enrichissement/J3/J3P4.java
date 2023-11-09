package com.cfpr.enrichissement.J3;

import java.util.Scanner;

public class J3P4 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez un nombre: ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nombre=saisirClavier(),result=0,nombre2=saisirClavier();
		
		for(int i=nombre;i<=nombre2;i++) {
			result=result+i;
		}
		afficherMessage("La  de somme total des nombres entre "+nombre +" et "+nombre2+ " est "+ result);
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

