package Atelier_4;

public class Employer {
	private String nom;
	private String prenom;
	private String adresse;
	private int anneeNaissance;
	private int anneeEncour;
	
	public int calculerAge() {
		int age =anneeNaissance-anneeEncour;
		return age;
	}
	
	public void afficherInformations() {
		System.out.print(nom);
		System.out.print(" "+prenom);
		System.out.print(" né le "+anneeNaissance);
		System.out.print(",habitant à "+adresse+".");
		System.out.println(" ");
	}
	Employer(String nom,String prenom,String adresse,int anneeNaissance){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.anneeNaissance=anneeNaissance;
	}
}
