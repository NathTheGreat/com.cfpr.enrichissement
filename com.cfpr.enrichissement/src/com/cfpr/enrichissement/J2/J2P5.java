package com.cfpr.enrichissement.J2;

public class J2P5 {

	static public final String ALPHABET= "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		faireBoucle();
		
		
	}
	
	public static void faireBoucle() {
		String inverseAlpha="";
		
		for(int i = 0;i < ALPHABET.length();i++) {
			afficherMessage(ALPHABET.charAt(i));
			inverseAlpha = ALPHABET.charAt(i)+ inverseAlpha;
		}
		System.out.println("\n" + inverseAlpha);
		
	}
	
	public static void afficherMessage(char c) {
		System.out.print(c);
	}


}
