package com.cfpr.enrichissement.J2;
import java.util.Scanner;

public class J2P7 {

	
	static Scanner lectureClavier = new Scanner(System.in);
	static public final String MSG_DEMANDE = "Entrez une phrase: ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase;
		int voyelle,consonne;
		
		phrase = saisirClavier();
		voyelle=faireBoucleVoyelle(phrase);
		consonne= calculerConsonne(phrase,voyelle);
		afficherMessage("Voyelles: "+voyelle);
		afficherMessage("Consonnes: "+consonne);
		
		
	}
	
	public static String saisirClavier() {
		String phrase = "";
		
		afficherMessage(MSG_DEMANDE);
		
		phrase = lectureClavier.nextLine();
		
		return phrase;
	}
	
	public static int calculerConsonne(String phrase,int voyelle) {
		int consonne;
		
		consonne=(phrase.length()-voyelle);
		
		return consonne;
	}
	
	
	public static int faireBoucleVoyelle(String phrase) {
		int voyelle =0;
		
		for(int i = 0;i < phrase.length();i++) {
			switch(phrase.charAt(i)) {
				case 'a':
					voyelle++;
					break;
				case 'e':
					voyelle++;
					break;
				case 'i':
					voyelle++;
					break;
				case 'o':
					voyelle++;
					break;
				case 'u':
					voyelle++;
					break;
				case 'y':
					voyelle++;
					break;
				default:
					
					break;
			}
		}
		
		return voyelle;
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}

}
