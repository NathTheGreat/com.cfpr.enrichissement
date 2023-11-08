package com.cfpr.enrichissement.J2;

import java.util.Scanner;
import java.util.ArrayList;

public class J2P8 {
	
	public static Scanner lectureClavier =new Scanner(System.in);
	public static ArrayList<String> listeMots = new ArrayList<>();
	public static String MSG_DEMANDE = "Veuillez entrez des mots: ";
						 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		afficherMessage(MSG_DEMANDE);
		
		listeMots = faireBoucle();
		
		
		
		afficherMessage(listeMots);
		
		
	
	}
	
	public static ArrayList<String> faireBoucle(){
		ArrayList<String> listeMotsBoucle = new ArrayList<>();
		String mot="";
		
		while(!mot.equals("stop")){
			mot = lireClavier();
			listeMotsBoucle.add(mot);
		}
		
		terminerProgramme();
		
		return listeMotsBoucle;
	}
	
	
	public static String lireClavier() {
		String mot ="";
		
		mot = lectureClavier.nextLine();
		
		return mot;
	}
	
	public static void afficherMessage(ArrayList<String> listeMots2) {
		System.out.println(listeMots2);
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
	}
	
	

}
