package com.cfpr.enrichissement.J3;

import java.util.Arrays;

public class J3P4Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab=new int[5];
		
		tab =faireBoucle(tab);
		afficherResultat(tab);
		afficherMessage(tab);
	}

	public static int[] faireBoucle(int[] tab) {
		
		for(int i=0;i<tab.length;i++) {
			int numeroR=(int) (Math.random()* 101);
			tab[i]=numeroR;
		}
		
		return tab;
	}
	
	public static void afficherResultat(int[]tab) {
		int plusGros=0,plusPetit=100,positionGros=0,positionPetit=0;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>plusGros) {
				plusGros=tab[i];
				positionGros=i+1;
			}
			if(tab[i]<plusPetit) {
				plusPetit=tab[1];
				positionPetit=i+1;
			}
		}
		
		afficherMessage("le nombre le plus gros est "+ plusGros+ " sa position est "+ positionGros);
		afficherMessage("le nombre le plus petit est "+ plusPetit+ " sa position est "+ positionPetit);
	}
	
	public static void afficherMessage(String message) {
		System.out.println(message);
	}
	
	public static void afficherMessage(int[] message) {
		System.out.println(Arrays.toString(message));
	}
}
