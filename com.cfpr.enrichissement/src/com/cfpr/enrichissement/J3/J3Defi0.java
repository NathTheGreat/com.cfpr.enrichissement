package com.cfpr.enrichissement.J3;

public class J3Defi0 {

	public static final String ALPHABET="abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] tableauAlpha = new char[ALPHABET.length()];
		
		tableauAlpha =faireBoucle();
		
		afficherMessage(tableauAlpha);
		
	}
	
	public static char[] faireBoucle() {
		char[] tableauBeta = new char[ALPHABET.length()];
		
		for(int i =0;i <ALPHABET.length();i++) {
			tableauBeta[i]=ALPHABET.charAt(i);
		}
		
		return tableauBeta;
	}
	
	public static void afficherMessage(char[] message) {
		for(int i =0;i <message.length;i++) {
			System.out.println(message[i]);
		}
		
	}


}
