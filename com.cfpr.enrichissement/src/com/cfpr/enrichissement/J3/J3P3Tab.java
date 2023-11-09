package com.cfpr.enrichissement.J3;

import java.util.Arrays;

public class J3P3Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab1 = new int[10];
		int [] tab2 = new int[10];
		
		tab1=faireBoucle(tab1);
		tab2=inverserTab(tab1,tab2);
		
		afficherMessage(tab1);
		afficherMessage(tab2);
	}
	
	public static int[] inverserTab(int[] tab1,int[] tab2) {
		int y=0;
		for(int i=tab1.length-1;i>=0;i--,y++) {
			
			tab2[y] = tab1[i];
		}
		return tab2;
	}
	
	public static int[] faireBoucle(int[] tab) {
		
		for(int i=0;i<tab.length;i++) {
			int numeroR=(int) (Math.random()* 101);
			tab[i]=numeroR;
		}
		
		return tab;
	}
	
	public static void afficherMessage(int[] message) {
		System.out.println(Arrays.toString(message));
	}

}
