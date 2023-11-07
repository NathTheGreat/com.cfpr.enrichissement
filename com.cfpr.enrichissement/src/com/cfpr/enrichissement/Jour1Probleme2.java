package com.cfpr.enrichissement;

public class Jour1Probleme2 {

	static final double SALAIRE = 28;
	static final double HORAIRE = 32;
	static final String MSG_SALAIRE ="Votre salaire pour deux semaines est de";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tauxHoraire, argentDeuxSemaines;
		
		tauxHoraire = calculerTauxHoraire(SALAIRE,HORAIRE);
		argentDeuxSemaines = calculerDeuxSemaine(tauxHoraire);
		Jour1.afficherMessage(MSG_SALAIRE + " " + argentDeuxSemaines);
	}
	
	
	public static double calculerTauxHoraire(double salaire,double horaire) {
		double tauxHoraire;
		
		tauxHoraire = salaire * horaire;
		
		return tauxHoraire;
	}
	
	public static double calculerDeuxSemaine(double tauxHoraire) {
		double argentDeuxSemaines;
		
		argentDeuxSemaines= tauxHoraire * 2;
		
		return argentDeuxSemaines;
	}

}
