package ploymorphisme_2;

import java.util.ArrayList;

public class Bibliotique extends Ouvrage {
	private ArrayList<Ouvrage> ouvrages;
	private ArrayList<Abonne> abonnes;
	
//Constructor
	public Bibliotique(ArrayList<Ouvrage> ouvrages, ArrayList<Abonne> abonnes) {
		super();
		this.ouvrages = ouvrages;
		this.abonnes = abonnes;
	}
//Methods
	public void ajoutOuvrage(Ouvrage ouvrage) {
		boolean exist = ouvrages.contains(ouvrage);
		if (exist == false) {
			ouvrages.add(ouvrage);
		} else {
			System.out.println("this ouvrage deja exist");
		}
	}

	public Ouvrage getOuvrage(String titre) {
		Ouvrage result = null;
		for (int i = 0; i < this.ouvrages.size(); i++) {
			if (this.ouvrages.get(i).getTitre() == titre) {
				result = this.ouvrages.get(i);
				break;
			}
		}
		return result;
	}
	
	public void ajoutAbonne(Abonne abonne) {
		boolean exist = abonnes.contains(abonne);
		if (exist == false) {
			abonnes.add(abonne);
		} else {
			System.out.println("this abonne deja exist");
		}
	}
	public Abonne getAbonne(int nuIdentite) {
		Abonne result = null;
		for (int i = 0; i < this.abonnes.size(); i++) {
			if (this.abonnes.get(i).getNumero() == nuIdentite) {
				result = this.abonnes.get(i);
				break;
			}
		}
		return result;
	}
	///
	@Override
	public String toString() {
		return "Bibliotique [ouvrages=" + ouvrages + ", abonnes=" + abonnes + ", getTitre()=" + getTitre()
				+ ", getDateCreation()=" + getDateCreation() + ", getIndicateurExistence()=" + getIndicateurExistence()
				+ ", toString()=" + super.toString()+ "]";
				
	}
	
	
	
}
