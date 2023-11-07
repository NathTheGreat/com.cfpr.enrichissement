package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P3 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE= "Veuillez entrez un mot: ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		int count=0;
		message = saisirClavier();
		
		for (int i = 0; i < message.length(); i++) {
			if(message.charAt(i) == 'a') {
				count++;
			}
		}
		
		afficherMessage(message.toUpperCase().replace('A','$'));
		afficherMessage(count);
		
		
	}
	
	public static String saisirClavier() {
		String message = "";
		
		afficherMessage(MSG_DEMANDE);
		
		message = lectureClavier.nextLine();
		
		return message;
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void terminerProgramme() {
		System.out.println("Merci d'avoir utilise le programme");
		lectureClavier.close();
	}
	

	
}