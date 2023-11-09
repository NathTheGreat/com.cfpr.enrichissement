package com.cfpr.enrichissement.J3;

public class J3P7Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[] faireBoucle(int[] tab) {
		
		for(int i=0;i<tab.length;i++) {
			int numeroR=(int) (Math.random()* 5);
			tab[i]=numeroR;
		}
		
		return tab;
	}

}
