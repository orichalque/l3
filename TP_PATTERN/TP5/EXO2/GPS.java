public class GPS extends Option {
	public GPS(BMW bm) {
		super (bm) ;
	}
	
	public int cout() {
		return (700+bmw.cout());
	}
}
