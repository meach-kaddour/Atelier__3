package polymorphisme;

public class Person {
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
	public void afficher() {
		System.out.println("name :"+nom);
		System.out.println("prenom :"+prenom);
		System.out.println("adresse :"+adresse);
		System.out.println("ville :"+ville);
		System.out.println("dateNaissance :"+dateNaissance);
	}
}
