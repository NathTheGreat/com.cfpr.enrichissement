package com.cfpr.enrichissement.J3;

import java.util.*;

public class J3P5Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = new int[10];
		tab=faireBoucle(tab);
		
		afficherMessage(tab);
		//inverse
		inverserTab(tab);
		
		;	
		
	}
	public static void inverserTab(int[] tab1) {
		int i;
		
		System.out.print("[");
        for(i = tab1.length - 1; i >= 1; i--) {
            System.out.print(tab1[i] + ", ");
        }
        System.out.print(tab1[i] + "]");
        
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
