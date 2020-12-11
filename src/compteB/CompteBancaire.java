package compteB;

public class CompteBancaire {
	private String nom;
	private long numeroCompte;
	private double solde;
	//Getters && Setters
	public String getName() {
		return nom;
	}
	public void setName(String nom) {
		this.nom=nom;
	}
	public void setnumeroCompte(long numeroCompte) {
		this.numeroCompte=numeroCompte;
	}
	public long getNumeroCompte() {
		return numeroCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde=solde;
	}
	////Methods
	public void ajouter(int montantAjouter) {
		if (montantAjouter > 0) {
			this.solde = solde + montantAjouter;

		} else {
			System.out.println("montant plus de votre solde");
		}
	}
	public void retirer(int montantRetirer) {

		if (montantRetirer < solde && montantRetirer > 0) {
			this.solde = solde - montantRetirer;

		} else {
			System.out.println("montant plus de votre solde");
		}

	}
	public void afficher() {
		System.out.println("le nom de compte"+nom);
		System.out.println("le numero de compte"+numeroCompte);
		System.out.println("le solde de compte"+solde);
	}
	
}
