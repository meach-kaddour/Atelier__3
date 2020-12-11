package Atelier_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		String rex_filePath = "rexAbo.wav";
		String max_filePath = "maxAbo.wav";
		
		Dog Rex = new Dog();
		Rex.name = "REX";
		Rex.aboyer(rex_filePath);
		Rex.manger("viande");
		
		Dog Max = new Dog();
		Max.name = "Max";
		Max.aboyer(max_filePath);
		Max.manger("viande");
		*/
		
		/*
		Dog1 Rex = new Dog1();
		Rex.name = "REX :";
		Rex.aboyer("ghhhhhh!!! wwaaarf!!");
		Rex.manger("viande");
		
		Dog1 Max = new Dog1();
		Max.name = "Max :";
		Max.aboyer("Iwiw!!Awaw!!");
		Max.manger("Poisson");
		*/
		/*
		Account one = new Account();
		one.nom = "El Alami hassan";
		one.adresse = "safi";
		one.solde = 14765.8;
		one.afficherInfosCompte();
		Account two = new Account();
		two.nom = "Karimi Khalid";
		two.adresse = "casablanca";
		two.solde = 7654;
		two.afficherInfosCompte();
		*/
		/*
		 Account_1 one = new Account_1();
		one.nom = "El Alami hassan";
		one.adresse = "safi";
		one.solde = 14765.8;
		one.afficherInfosCompte();
		one.calculerInterer(7);
		
		Account_1 two = new Account_1();
		two.nom = "Karimi Khalid";
		two.adresse = "casablanca";
		two.solde = 7654;
		two.afficherInfosCompte();
		one.calculerInterer(7);
		*/
		/*
		Exercise_5 hh=new Exercise_5();
		hh.setAdresse("youcode");
		
		System.out.println("your adresse : "+ hh.getAdresse());
		*/
		
		Exercise_6 Test = new Exercise_6();
		Test.setSolde(174);
		System.out.println("Enter le monant à retirer !");
		Scanner input = new Scanner(System.in);
		int montantretirer = input.nextInt();
		Test.retierMontantSolde(montantretirer);
		System.out.println(Test.getSolde());
		
		//Heritage
		//Exercise 1
		/*
		Article stylo=new Article();
		stylo.setName("stylo");
		stylo.setPrix(40);
		
		
		ArticleEnSolde styloEnSolde=new ArticleEnSolde();
		styloEnSolde.setName("stylo");
		styloEnSolde.setPrix(40);
		styloEnSolde.afficher();
		styloEnSolde.reduction(5);
		
		styloEnSolde.afficher();
		 
		*/
	}
}
