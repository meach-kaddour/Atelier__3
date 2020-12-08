package Atelier_2;

import java.util.Scanner;

public class Exercise_6 {
	static Scanner input = new Scanner(System.in);
	private String nom;
	private String adresse;
	private double solde;

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		if(solde>0) {
			this.solde = solde;
		}
		else {
			System.out.println("?????");
		}
	}

	public void retierMontantSolde(int montantRetirer) {

		if (montantRetirer < solde && montantRetirer > 0) {
			this.solde = solde - montantRetirer;

		} else {
			System.out.println("montant plus de votre solde");
		}

	}

	public static void main(String[] args) {
		Exercise_6 Test = new Exercise_6();
		Test.setSolde(174);
		int inpot = input.nextInt();
		Test.retierMontantSolde(inpot);
		System.out.println(Test.getSolde());
	}

}
