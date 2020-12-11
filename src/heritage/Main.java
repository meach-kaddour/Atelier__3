package heritage;

public class Main {
public static void main(String[] args) {
	//Exercise 3
	
	Etudient yassine=new Etudient("yassine","momen","taqadom","nul",1996,"developement");
	System.out.println(yassine.toString());
	
	Secretaire loub =new Secretaire("loub","mmm","smara","youyou",1996,"1234567");
	System.out.println(loub.toString());
	
	Enseignant bouchra=new Enseignant("loub","mmm","smara","youyou",1996,"physique");
	System.out.println(bouchra.toString());
	bouchra.nom="KIKO";
	System.out.println(bouchra.toString());
	
}
}
