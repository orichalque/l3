abstract class Prof {
	protected String nom;
	protected String prenom;
	
	Prof(String n, String p) {
		nom = n;
		prenom = p;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
}
