public class Hexa extends Decorator {
	public Hexa(Entier e){
		super(e);
	}
	
	public int base() {
		int k = n;
		String s = Integer.toHexString(k);
		k = s;
		return k;
	}
}
