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
	public static void main(String[] args) {
		Account_1 one = new Account_1();
		one.nom = "El Alami hassan";
		one.adresse = "safi";
		one.solde = 14765.8;
		one.afficherInfosCompte();
		one.calculerInterer(0.7);
		Account_1 two = new Account_1();
		two.nom = "Karimi Khalid";
		two.adresse = "casablanca";
		two.solde = 7654;
		two.afficherInfosCompte();
		one.calculerInterer(0.7);
	}

}
