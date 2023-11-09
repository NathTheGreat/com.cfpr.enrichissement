package com.cfpr.enrichissement.J4;

import java.util.Scanner;

public class J4TP2 {
	
	public static Scanner lectureClavier1=new Scanner(System.in);
	public static Scanner lectureClavier2=new Scanner(System.in);
	public static Scanner lectureClavier3=new Scanner(System.in);
	public static Scanner lectureClavier4=new Scanner(System.in);
	public static final String MSG_DEMANDE ="Entrez le nombre # ";
	public static final String MSG_OPERATION="Choisissez l'operation que vous voulez:";
	public static final String MSG_FIN="Merci d'avoir utilise notre programme !";
	public static final String MSG_CALCUL="Voulez vous faire un autre calcul ? (Y ou N) ";
	public static boolean loop=false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nombre1,nombre2,somme = 0;
		String equation;
		
		do {
			nombre1=lireClavierNombre1();
			nombre2=lireClavierNombre2();
			equation =lireClavierEquation();
			equation.toUpperCase();
			
			switch(equation) {
			case "A":
				somme=nombre1+nombre2;
				break;
			case "S":
				somme=nombre1-nombre2;
				break;
			case "X":
				somme=nombre1*nombre2;
				break;
			case "D":
				somme=nombre1/nombre2;
				break;
			case "M":
				somme=nombre1%nombre2;
				break;
			case "C":
				somme=Math.pow(nombre1,2);
				break;
			case "P":
				somme=Math.pow(nombre1,nombre2);
				break;
			case "R":
				somme=Math.sqrt(nombre1);
				break;
			case "L":
				somme=Math.log(nombre1);
				break;
			case "Q":
				loop=true;
				terminerProgramme();
				break;
			}
			
			if(loop==false) {
				afficherMessage("" + somme);
				afficherMessage(MSG_CALCUL);
			}
			
			
			
		}while(loop==false);
		
		terminerProgramme();
		
	}
	
	public static double lireClavierNombre1() {
		double nombre1;
		
		afficherMessage(MSG_DEMANDE+ 1);
		
		nombre1=lectureClavier1.nextDouble();
		
		return nombre1;
	}
	
	public static double lireClavierNombre2() {
		double nombre2;
		
		afficherMessage(MSG_DEMANDE+ 2);
		
		nombre2=lectureClavier2.nextDouble();
		
		return nombre2;
	}
	
	public static String lireClavierEquation() {
		String equation;
		
		afficherMessage(MSG_OPERATION);
		
		equation=lectureClavier3.nextLine();
		
		return equation;
	}
	
	public static String lireClavierQuestion() {
		String reponse;
		reponse=lectureClavier4.nextLine();
		reponse.toUpperCase();
		
		if(reponse.equals("Y")) {
			loop=false;
		}
		else if(reponse.equals("N")) {
			loop=true;
		}
		
		
		return reponse;
	}
	
	public static void terminerProgramme() {
		lectureClavier1.close();
		lectureClavier2.close();
		lectureClavier3.close();
		loop=true;
		afficherMessage(MSG_FIN);
		
	}
	
	
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}

}
