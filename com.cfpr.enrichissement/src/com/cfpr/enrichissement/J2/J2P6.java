package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P6 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez un nombre: ";
	static int grosNombre = 0,nombreCheck=0,petitNombre=0,total=0,
			   nombreLoop=0,Moyenne=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		faireBoucle();
		afficherMessage(grosNombre);
		afficherMessage(petitNombre);
		afficherMessage(Moyenne);
	}

	public static void faireBoucle() {
		
		do {
			nombreCheck = saisirClavier();
			
			if(nombreCheck>grosNombre)
			{
				grosNombre=nombreCheck;
			}
			else if(nombreCheck<petitNombre) {
				petitNombre=nombreCheck;
			}
			
			total+=nombreCheck;
			nombreLoop++;
			
		}while(nombreCheck != 0);
		
		Moyenne=total/nombreLoop;
		
		
		
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
