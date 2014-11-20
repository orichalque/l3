public class Couleur extends Option{
	public Couleur(BMW bm) {
		super (bm) ;
	}
	
	public int cout() {
		return (2000+bmw.cout());
	}
}
