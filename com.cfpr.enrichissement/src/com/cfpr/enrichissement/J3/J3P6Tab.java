package com.cfpr.enrichissement.J3;

public class J3P6Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab= new int[10];
		int sommePos=0,sommeNeg=0;
		
		tab=remplirTab(tab);
		sommePos=calculerSommePos(tab);
		sommeNeg=calculerSommeNeg(tab);
		afficherMessage(sommePos);
		afficherMessage(sommeNeg);
		
	}
	
	public static int[] remplirTab(int[] tab) {
		
		for(int i=0;i<tab.length;i++) {
			int numeroR=(int) (Math.random()* 201)-100;
			tab[i]=numeroR;
		}
		
		return tab;
	}
	
	public static int calculerSommePos(int[]tab) {
		int sommePos=0;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]>0) {
				sommePos += tab[i];
			}
		}
		
		
		return sommePos;
	}
	
	public static int calculerSommeNeg(int[]tab) {
		int sommeNeg=0;
		
		for(int i=0;i<tab.length;i++) {
			if(tab[i]<0) {
				sommeNeg += tab[i];
			}
		}
		
		
		return sommeNeg;
	}
	
	public static void afficherMessage(int message) {
		System.out.println(message);
	}

}
