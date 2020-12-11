package Atelier_4;

public class ArticleEnSolde extends Article {
	public void reduction(int pourcentageReduction) {
		int nouveauPrix=this.getPrix()-pourcentageReduction;
		this.setPrix(nouveauPrix);
	}
	public void afficher(){
		System.out.println("prix d'article :"+getPrix());
		
	}
	
}
