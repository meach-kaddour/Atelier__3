package ploymorphisme_2;

public class Video extends Ouvrage {

private String editeur;
private int duree;
//Constructor
public Video(String titre, String dateCreation, boolean indicateurExistence,String editeur,int duree) {
		super(titre, dateCreation, indicateurExistence);
		this.duree=duree;
		this.editeur=editeur;
	}

public String getEditeur() {
	return editeur;
}
//Getter && Setters

public void setEditeur(String editeur) {
	this.editeur = editeur;
}

public int getDuree() {
	return duree;
}

public void setDuree(int duree) {
	this.duree = duree;
}
//Redifinition du Methode Afficher()
public void afficher() {
	System.out.println("tite d'ouvrage:"+getTitre());
	System.out.println("crer le  :"+getDateCreation());
	System.out.println("disponiblité : "+getIndicateurExistence());
	System.out.println("l'editeur de video"+editeur);
	System.out.println("la duree de video"+duree);
	System.out.println("------------------");
}


}
