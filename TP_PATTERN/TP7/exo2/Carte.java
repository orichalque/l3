abstract class Carte {
	protected String nom;
	protected int solde;
	
	public Carte(String s, int sold) {
		nom = s;
		solde = sold;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public boolean isAE() {
		return false;
	}
	
	public boolean isMC() {
		return false;
	}
	
	public boolean isCB() {
		return false;
	}
}
