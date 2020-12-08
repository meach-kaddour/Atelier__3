package Atelier_2;
public class Account_1 {
	String nom;
	String adresse;
	double solde;

	void afficherInfosCompte() {
		System.out.println(nom + " habite : (" + adresse + ")- infos solde " + solde + " DH");
	}

	double calculerInterer(double tauxInteret) {
		double interer = (int)(solde * tauxInteret/100);
		System.out.println("votre interet "+interer);
		return interer;

	}
	

}
