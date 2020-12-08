package Atelier_2;

public class Account {
	String nom;
	String adresse;
	double solde;

	void afficherInfosCompte() {
		System.out.println(nom + " habite à (" + adresse + ")- infos solde " + solde + " DH");
	}

	public static void main(String[] args) {
		Account one = new Account();
		one.nom = "El Alami hassan";
		one.adresse = "safi";
		one.solde = 14765.8;
		one.afficherInfosCompte();
		Account two = new Account();
		two.nom = "Karimi Khalid";
		two.adresse = "casablanca";
		two.solde = 7654;
		two.afficherInfosCompte();
		
		
	}
}
