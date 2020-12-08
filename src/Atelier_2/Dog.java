package Atelier_2;
//Exercise 1

public class Dog {
	String name;

	String aboyer(String sens) {
		System.out.println(name + " dit " + sens);
		return sens;
	}

	String manger(String food) {
		System.out.println(" je mange " + food);
		return food;
	}

	public static void main(String[] args) {
		
		AudioRunner dogAboyer = new AudioRunner();
		String rex_filePath = "rexAbo.wav";
		String max_filePath = "maxAbo.wav";
		
		Dog Rex = new Dog();
		Rex.name = "REX";
		dogAboyer.playAudio(rex_filePath);
		Rex.manger("viande");
		
		Dog Max = new Dog();
		Max.name = "Max";
		dogAboyer.playAudio(max_filePath);
		Max.manger("viande");
	}

}
