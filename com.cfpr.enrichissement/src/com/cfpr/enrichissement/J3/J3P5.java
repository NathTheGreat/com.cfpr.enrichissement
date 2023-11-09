package com.cfpr.enrichissement.J3;

import java.util.Scanner;

public class J3P5 {

	static Scanner lectureClavier = new Scanner(System.in);
	static Scanner lectureClavier2 = new Scanner(System.in);
	static public final String MSG_TEMP= "Entrez la temperature: ";
	static public final String MSG_DEMANDE = "Entrez le type de degree a convertir (C ou F) ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp = saisirClavier2();
		String type=saisirClavier();
		faireIf(type,temp);
	}

	public static String saisirClavier() {
		String type = "";
		
		afficherMessage(MSG_DEMANDE);
		
		type = lectureClavier.nextLine();
		
		return type;
	}
	
	public static double saisirClavier2() {
		double nombre = 0;
		
		afficherMessage(MSG_TEMP);
		
		nombre = lectureClavier2.nextDouble();
		
		return nombre;
	}
	
	public static void faireIf(String type,double temp) {
		
		
		if(type.equals("C")) {
			temp = temp * 9/5+32;
			afficherMessage("la temperature en Fahrenheit est de "+temp+ " F");
		}
		else if(type.equals("F")) {
			temp =(temp - 32)*5/9;
			afficherMessage("la temperature en Celcius est de "+temp+" C");
		}
		else {
			afficherMessage("Ceci n'est pas un type de degree");
		}
		
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}

}
