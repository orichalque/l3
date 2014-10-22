public class Main {
	public static void main(String[] args) {
		Sujet s = new Station();
		Observer o = new Affichage(s);
		
		s.update();
		o.afficher();
		s.update();
		o.afficher();
		o.moyenne();
	}
}
