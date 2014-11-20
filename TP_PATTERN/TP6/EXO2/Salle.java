class Salle {
	String nom;
	public Salle(String s) {
		nom = s;
	}
	
	public void allumer() {
		System.out.println(nom+ " allumée !");
	}	
	
	public void eteindre() {
		System.out.println(nom+ " éteinte... ");
	}
	
	
}
