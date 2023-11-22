package com.cfpr.enrichissement.J4;

import java.util.Arrays;

public class J4P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tab=new int[10];
		tab=remplirRandom(tab);
		scannerTab(tab);
	}
	
	public static int[] remplirRandom(int[] tab) {
		for(int i=0;i<tab.length;i++) {
			tab[i]=(int) (Math.random()*5);
		}
		return tab;
	}
	
	public static void scannerTab(int[] tab) {
		int[] tabResultat= {0,0,0,0,0};
		for(int i=0;i<tab.length;i++) {
			switch(tab[i]) {
			case 0:
				tabResultat[0]++;
				break;
			case 1:
				tabResultat[1]++;
				break;
			case 2:
				tabResultat[2]++;
				break;
			case 3:
				tabResultat[3]++;
				break;
			case 4:
				tabResultat[4]++;
				break;
			}
		}
		
		System.out.println(Arrays.toString(tab));
		
		for(int i=0;i<tabResultat.length;i++) {
			System.out.println("Nombre de "+i+" : "+tabResultat[i]);
		}
	}

}
