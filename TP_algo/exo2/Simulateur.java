class Simulateur {
	public static void main(String[] args) {
		Noeud k = new Noeud('-', new Noeud('a'), new Noeud('b'));
		Arbre a = new Arbre(k);
/*
  (-)
 /   \
A     B

*/		a.display(k);	
		System.out.println();
	}
}
