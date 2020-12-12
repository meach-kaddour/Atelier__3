package compteB;

public class compteEpargne extends CompteBancaire {
	double taux =10;
	@Override
	public void setSolde(double s) {
		if(s>200) {
			this.solde=s;
		}else {
			this.solde=0;
			System.out.println("compte epargne doit initialiser a un montant superieur de 200 dh");
		}
	}
	
	compteEpargne() {
		
	}

	public compteEpargne(String nom, long numeroCompte, double s) {
		super(nom, numeroCompte, s);
		if(s>200) {
			this.solde=s;
		}else {
			this.solde=0;
			System.out.println("compte epargne doit initialiser a un montant superieur de 200 dh");
		}
	}

	public void calculerInterer() {
		solde=solde*(1+taux/100);
	}

	@Override
	public String toString() {
		return "compteEpargne [taux d'interet =" + taux + "  Name =" + getName() +", solde=" + solde +  " Numero de Compte ="
				+ getNumeroCompte() + "]";
	}

	
	
	

}
