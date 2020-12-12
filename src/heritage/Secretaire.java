package heritage;

public class Secretaire extends Person {
	String numeroCompte;
	@Override
	public String toString() {
		return "Secretaire [numeroCompte=" + numeroCompte + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}

	public Secretaire(String nom, String prenom, String adresse, String ville, int dateNaissance, String numeroCompte) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.numeroCompte = numeroCompte;
	}

	@Override
	public void ecrirePersonne() {
		System.out.println("name :" + nom);
		System.out.println("prenom :" + prenom);
		System.out.println("adresse :" + adresse);
		System.out.println("ville :" + ville);
		System.out.println("dateNaissance" + dateNaissance);
		System.out.println("nNumero de bureau :" + numeroCompte);
	}

}
