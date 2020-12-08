package Atelier_2;

public class Exercise_5 {
	private String name;
	private String adresse;
	private double solde;

	public void setName(String name) {
		this.name=name;
	}

	public void setAdresse(String adresse) {
		this.adresse=adresse;
	}

	public void setSolde(double solde) {
		this.solde=solde;
	}
	
	
	public String getName() {
		return name;
	}

	public String getAdresse() {
		return adresse;
	}

	public double getSolde() {
		return solde;
	}

	public static void main(String[] args) {
		Exercise_5 hh=new Exercise_5();
		hh.setAdresse("eeee");
		System.out.println("your adresse : "+ hh.getAdresse());
		
	}

}
