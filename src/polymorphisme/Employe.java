package polymorphisme;

public class Employe extends Person {
	double salaire;
	
	public Employe(String nom, String prenom, String adresse, String ville, int dateNaissance, double salaire) {
		super(nom, prenom, adresse, ville, dateNaissance);
		this.salaire = salaire;
	}

	public void afficher() {
		System.out.println("Nom d'employe :"+this.nom);
		System.out.println("Prenom d'employe:"+this.prenom);
		System.out.println("Adresse d'employe:"+this.adresse);
		System.out.println("Ville d'employe:"+this.ville);
		System.out.println("Date de Naissance d'employe:"+this.dateNaissance);
		System.out.println("Salaire d'employe: "+salaire);
	}
}
