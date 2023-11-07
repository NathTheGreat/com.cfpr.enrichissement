package com.cfpr.enrichissement;

import java.util.Scanner;

public class Jour1Probleme3 {

	static final String MSG_SAISIR = "Quel est votre age ?";
	static final String MSG_TERMINER = "Merci d'avoir utiliser le programme";
	static final String MSG_MOYENNE = "La moyenne d'age est de ";
	static final String MSG_AINE = "L'age de l'aine est de ";
	static Scanner lectureClavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Aine,Age1,Age2;
		double Moyenne;
		
		Age1= lireAge();
		Age2= lireAge();
		
		Moyenne = calculerMoyenne(Age1,Age2);
		afficherMessage(MSG_MOYENNE + Moyenne);
		Aine = comparerAge(Age1,Age2);
		afficherMessage(MSG_AINE+ Aine);
		terminerProgramme();
	}
	
	public static int lireAge() {
		int age = 0;
		
		afficherMessage(MSG_SAISIR);
		
		age = lectureClavier.nextInt();
		
		return age;
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
		
	}
	
	public static void terminerProgramme() {
		lectureClavier.close();
		afficherMessage(MSG_TERMINER);
	}
	
	public static int comparerAge(int Age1 ,int  Age2) {
		int Aine;
		
		if(Age1 < Age2) 
		{
			Aine = Age2;
		}
		else
		{
			Aine = Age1;
		}
		
		return Aine;
	}
	
	public static double calculerMoyenne(int Age1 ,int  Age2) {
		double Moyenne;
		
		Moyenne = (Age1 + Age2)/2; 
		
		return Moyenne;
	}

}
