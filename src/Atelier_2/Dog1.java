package Atelier_2;

//Exercise 2

public class Dog1 {
	String name;

	void aboyer(String sens) {
		if(sens!="Iwiw!!Awaw!!") {
			System.out.print(name +" Je suis en col�re  "+sens+"-");
		}
		else {
			System.out.print(name +" Je ne suis pas du tout en col�re  "+sens+"-");
		}
		
	}

	void manger(String food) {
		System.out.println(" je mange du  "+food);
	}
	public static void main(String[] args) {
		Dog1 Rex = new Dog1();
		Rex.name = "REX :";
		Rex.aboyer("ghhhhhh!!! wwaaarf!!");
		Rex.manger("viande");
		
		Dog1 Max = new Dog1();
		Max.name = "Max :";
		Max.aboyer("Iwiw!!Awaw!!");
		Max.manger("Poisson");
		
	}

}

