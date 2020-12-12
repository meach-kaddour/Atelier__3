package compteB;

public class CompteBancaire {
	private String nom;
	private long numeroCompte;
	protected double solde;
	
	//Constructor
	public CompteBancaire(String nom, long numeroCompte, double solde) {
		super();
		this.nom = nom;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public CompteBancaire() {
		super();
	}

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
			System.out.println("tu ajoute qoui?!!");
		}
	}
	public void retirer(int montantRetirer) {

		if (montantRetirer < solde && montantRetirer > 0) {
			this.solde = solde - montantRetirer;

		} else {
			System.out.println("montant plus de votre solde");
		}

	}
	
	public String toString() {
		return "CompteBancaire [nom=" + nom + ", numeroCompte=" + numeroCompte + ", solde=" + solde + "]";
	}
	
	
}
