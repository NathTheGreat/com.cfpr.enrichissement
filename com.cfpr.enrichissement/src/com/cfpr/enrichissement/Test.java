package com.cfpr.enrichissement;

import java.util.Scanner;

public class Test {

	static Scanner lectureClavier = new Scanner(System.in);
	static final String MSG_SAISIR= "Saisir un nombre au clavier";
	static final String MSG_TERMINER = "Merci d'avoir utiliser le programme";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y , z;
		
		x = lireNombre();
		y = lireNombre();
		
		z = comparerNombres(x,y);
		
		afficherMessage(String.valueOf(z));
		terminerProgramme();
		
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
		System.out.println("--------------------------");
		
	}
	
	public static int lireNombre() {
		int nombre = 0;
		
		afficherMessage(MSG_SAISIR);
		
		nombre = lectureClavier.nextInt();
		
		return nombre;
	}
	
	public static int comparerNombres(int x ,int  y) {
		int z;
		
		if(x < y) 
		{
			z = y;
		}
		else
		{
			z = x;
		}
		
		return z;
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
		afficherMessage(MSG_TERMINER);
	}
	
	

}
