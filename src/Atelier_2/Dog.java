package Atelier_2;
//Exercise 1

public class Dog {
	String name;

	String aboyer(String sens) {
		System.out.println(name + " dit :");
		AudioRunner dogAboyer = new AudioRunner();
		dogAboyer.playAudio(sens);
		
		return sens;
	}

	String manger(String food) {
		System.out.println(" je mange " + food);
		return food;
	}


}
