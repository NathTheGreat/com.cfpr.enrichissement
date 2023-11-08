package com.cfpr.enrichissement.J2;

import java.util.Scanner;

public class J2P10 {

	static Scanner lectureClavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tableauAlpha = new int[2];
		
		tableauAlpha =faireBoucle();
		
		afficherMessage(tableauAlpha);
		
	}
	
	public static int[] faireBoucle(char []) {
		int[] tableauBeta = new int[2];
		
		for(int i =0;i <tableauBeta.length;i++) {
			System.out.println("Entrez le nombre #"+ i);
			tableauBeta[i]= lectureClavier.nextInt();
		}
		
		return tableauBeta;
	}
	
	public static void afficherMessage(int[] message) {
		if(message[0]>message[1]) {
			System.out.println(message[0]);
		}
		else {
			System.out.println(message[1]);
		}
	}


}