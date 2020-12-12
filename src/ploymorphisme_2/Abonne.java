package ploymorphisme_2;

public class Abonne {
	private int numero;
	private String nom;
	private int numeroAbonne;
	
	public Abonne(int n,String nom,int nAb) {
		this.numero=n;
		this.nom=nom;
		this.numeroAbonne=nAb;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int n) {
		this.numero=n;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	
	public int getNumeroAbonne() {
		return numeroAbonne;
	}
	
	public void setNumeroAbonne(int nAb) {
		this.numeroAbonne=nAb;
	}


}
