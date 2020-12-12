package compteB;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercise 2
				CompteBancaire first = new CompteBancaire();
				first.setName("premier");
				first.setnumeroCompte(1234567790);
				first.setSolde(40);
				System.out.println(first.toString());
				
				CompteBancaire second = new CompteBancaire("karim",1234,890);
				System.out.println(second.toString());
				
				
				compteEpargne third = new compteEpargne();
				third.setName("abdo");
				third.setnumeroCompte(790);
				third.setSolde(400);
				System.out.println(third.toString());
				
				compteEpargne four = new compteEpargne("kaddour",345,56);
				System.out.println(four.toString());
				four.ajouter(1000);
				four.retirer(500);
				System.out.println(four.toString());
				four.calculerInterer();
				System.out.println(four.toString());
	}

}
