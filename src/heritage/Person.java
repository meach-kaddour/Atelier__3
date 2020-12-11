package heritage;

public abstract  class Person {
	String nom;
	String prenom;
	String adresse;
	String ville;
	int dateNaissance;
	Person(String nom, String prenom, String adresse, String ville, int dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.ville= ville;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}

	Person() {
	}

	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	public abstract void  ecrirePersonne(); 
	public void modifierPersonne(String adresseUpdated, String villeUpdated) {
		this.ville = villeUpdated;
		this.adresse = adresseUpdated;
	}
	
}
