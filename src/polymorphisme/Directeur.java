package polymorphisme;

public class Directeur extends Chef {
	String societeName;
	
	public Directeur(String nom, String prenom, String adresse, String ville, int dateNaissance, double salaire,
			String service, String societeName) {
		super(nom, prenom, adresse, ville, dateNaissance, salaire, service);
		this.societeName = societeName;
	}

	public void afficher() {
		System.out.println("Nom de directeur :"+nom);
		System.out.println("Prenom de directeur:"+prenom);
		System.out.println("Adresse de directeur:"+adresse);
		System.out.println("Ville de directeur:"+ville);
		System.out.println("DateNaissance de directeur:"+dateNaissance);
		System.out.println("Salaire de directeur:"+salaire);
		System.out.println("Service de directeur:"+service);
		System.out.println("Nom de societe "+societeName);
	}
}
