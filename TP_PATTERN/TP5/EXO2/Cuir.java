public class Cuir extends Option{
	public Cuir(BMW bm) {
		super (bm) ;
	}
	
	public int cout() {
		return (1200+bmw.cout());
	}
}
