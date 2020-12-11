package compteB;

public class compteEpargne extends CompteBancaire {
	
	public void setSolde(double solde) {
		if(solde>200) {
			this.setSolde(solde);
		}else {
			System.out.println("compte epargne doit initialiser a un montant superieur de 200");
		}
	}
	
	public void calculerInterer(double tauxInteret) {
		if(getSolde()>200) {
			double interer = getSolde() * tauxInteret/100;
			System.out.println("votre interet "+interer);
		}else {
			System.out.println("error");;
		}
		
	}
	

}
