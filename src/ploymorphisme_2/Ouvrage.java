package ploymorphisme_2;



public class Ouvrage {
	//Characteristic d'ouvrage
	private String titre;
	private String dateCreation ;
	private boolean indicateurExistence;
	
	//Constructor
	public Ouvrage() {
		
	}
	public Ouvrage(String titre, String dateCreation, boolean indicateurExistence) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.indicateurExistence = indicateurExistence;
	}
	
	//Getters && Setters
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public boolean getIndicateurExistence() {
		return indicateurExistence;
	}
	public void setIndicateurExistence(boolean indicateurExistence) {
		this.indicateurExistence = indicateurExistence;
	}
	//La Methode Afficher()
	public void afficher() {
		System.out.println("tite d'ouvrage:"+titre);
		System.out.println("crer le  :"+dateCreation);
		System.out.println("disponiblité : "+indicateurExistence);
		System.out.println("------------------");
	}
}
