abstract class Lettre {
	protected String texte;
	
	public Lettre(Carte c) {
		texte = "Carte de: "+c.getNom()+" qui a un solde de: "+c.getSolde();
	}
	
	public void getTexte() {
		System.out.println(texte);
	}
	
}
