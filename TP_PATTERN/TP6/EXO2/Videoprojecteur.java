class Videoprojecteur {
	String nom;
	
	public Videoprojecteur(String s) {
		nom = s;
	}
	
	public void allumer() {
		System.out.println(nom+ " allumé !");
	}
	
	public void eteindre() {
		System.out.println(nom+ " éteint... ");
	}
}
