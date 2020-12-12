package heritage;

public class Enseignant extends Person {
	String specialite;
	
	@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse
				+ ", ville=" + ville + ", dateNaissance=" + dateNaissance + "]";
	}

	public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialite) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.specialite = specialite;
	}

	@Override
	public void ecrirePersonne() {
		System.out.println("name :"+nom);
		System.out.println("prenom :"+prenom);
		System.out.println("adresse :"+adresse);
		System.out.println("ville :"+ville);
		System.out.println("dateNaissance"+dateNaissance);
		System.out.println("specialité :"+specialite);
		
	}



}
