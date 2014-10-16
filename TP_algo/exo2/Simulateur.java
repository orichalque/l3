class Simulateur {
	public static void main(String[] args) {
		Noeud k = new Noeud('-', new Noeud('a', new Noeud('k'), null), new Noeud('b'));
		Arbre a = new Arbre(k);
/*					
  (-)				(-)
 /   \			   A   B	
A     B			K 			Height = 2, works modafakin fine

*/		a.display(k);	
		System.out.println();
		int i = a.height(k);
		System.out.println(i);
	}
}
