class Main {
	public static void main(String args[] ) {
		Carte c = new AE("Joseph", 500000);
		Factory f = new FactoryC(c);
		f.create().getTexte();
	}
}
