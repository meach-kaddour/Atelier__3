package polymorphisme;

public class Test {
public static void main(String[] args) {
	//tableau de huit personnes avec cinq employés, deux chefs et un directeur 
	Person[] personnes= new Person[8];
	personnes[0]=new Employe("first","fir","quartier x","safe",1989,3500);
	personnes[1]=new Employe("second","sec","quartier y","sale",1959,4500);
	personnes[2]=new Employe("third","thi","quartier z","tata",1987,5500);
	personnes[3]=new Employe("four","fou","quartier w","casa",1999,6500);
	personnes[4]=new Employe("five","fiv","quartier u","tanja",1990,4500);
	
	personnes[5]=new Chef("first","fir","quartier y","safe",1989,38000,"humaine");
	personnes[6]=new Chef("second","sec","quartier z","sale",1979,13500,"Production");
	
	personnes[7]=new Directeur("lmodir","flan","kachkat","youssoufia",1989,3500,"direction generale","hypernova");
	
	
	for (int i = 0; i < personnes.length; i++) {
		personnes[i].afficher();
		System.out.println("----------------------------");
	}
}
}
