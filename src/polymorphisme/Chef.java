package polymorphisme;

public class Chef extends Employe {
	String service;
	
	
	public Chef(String nom, String prenom, String adresse, String ville, int dateNaissance, double salaire,
			String service) {
		super(nom, prenom, adresse, ville, dateNaissance, salaire);
		this.service = service;
	}


	public void afficher() {
		System.out.println("Nom de Chef :"+nom);
		System.out.println("Prenom de Chef :"+prenom);
		System.out.println("Adresse de Chef:"+adresse);
		System.out.println("Ville de Chef:"+ville);
		System.out.println("DateNaissance de Chef:"+dateNaissance);
		System.out.println("Salaire de Chef:"+salaire);
		System.out.println("Service de Chef :"+service);
	}
}
