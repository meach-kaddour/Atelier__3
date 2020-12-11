package Atelier_4;

public class Article {
	private String name;
	private int prix;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix=prix;
	}
	public void afficher(){
		System.out.println("prix d'article :"+prix);
	}
	
}
