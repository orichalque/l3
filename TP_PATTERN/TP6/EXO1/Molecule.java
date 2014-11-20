class Molecule {
	protected String nom;
	protected String formule;
	
	public Molecule(String s, String f) {
		nom = s;
		formule = f;
	}
	
	public Molecule() {
		nom = "";
		formule = "";
	}
	
	public void afficher(){ 
		System.out.println("Nom: "+nom+" formule: "+formule);
	}
	
	public String getNom() {
		return nom;
	}
}
