package heritage;

public class Main {
public static void main(String[] args) {
	//Exercise 3
	
	Etudient yassine=new Etudient("yassine","momen","taqadom","nul",1996,"developement");
	yassine.ecrirePersonne();
	yassine.modifierPersonne("boulvard rabat", "safi");
	System.out.println(yassine.toString());
	
	Secretaire loub =new Secretaire("loub","mmm","smara","youyou",1996,"1234567");
	System.out.println(loub.toString());
	loub.ecrirePersonne();
	loub.modifierPersonne(null, "CASA");
	
	Enseignant bouchra=new Enseignant("bouchra","xx","ghdir","safe",1989,"data science");
	System.out.println(bouchra.toString());
	bouchra.nom="teacher";
	bouchra.modifierPersonne(null, "sale");
	bouchra.ecrirePersonne();
	System.out.println(bouchra.toString());
	
}
}
