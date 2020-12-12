package ploymorphisme_2;

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
	ArrayList<Ouvrage> firstOuvrage = new ArrayList<Ouvrage>();
	ArrayList<Abonne> firstListAbonnes=new ArrayList<Abonne>();
	
	
	Bibliotique B1=new Bibliotique(firstOuvrage,firstListAbonnes);
	
	B1.ajoutOuvrage(new Ouvrage("kaddou","No",true));
	
	System.out.println(firstOuvrage.size());
	
}
}
