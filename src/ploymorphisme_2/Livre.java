package ploymorphisme_2;

public class Livre extends Ouvrage {
	private String auteur;
	
	//Constructor
	
	public Livre(String titre, String dateCreation, boolean indicateurExistence,String aut) {
		super(titre, dateCreation, indicateurExistence);
		this.auteur=aut;
	}
	public Livre() {
	}
	//Getters && Setters
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	//Redifinition du Methode Afficher()
	public void afficher() {
		System.out.println("tite d'ouvrage:"+getTitre());
		System.out.println("crer le  :"+getDateCreation());
		System.out.println("disponiblité : "+getIndicateurExistence());
		System.out.println("l'auteur de livre"+auteur);
		System.out.println("------------------");
	}
}
