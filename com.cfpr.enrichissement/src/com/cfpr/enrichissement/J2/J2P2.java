package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P2 {

	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE= "Veuillez entrez un mot: ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message;
		message = saisirClavier();
		afficherMessage(message.length());
	}
	
	public static String saisirClavier() {
		String message = "";
		
		afficherMessage(MSG_DEMANDE);
		
		message = lectureClavier.nextLine();
		
		return message;
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
		System.out.println("---------------------");
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
		System.out.println("---------------------");
	}
	

	
}
