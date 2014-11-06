public class Binaire extends Decorator {
	public Binaire(Entier e){
		super(e);
	}
	
	public int base() {
		int k = n;
		String s = Integer.toBinaryString(k);
		k = Integer.parseInt(s);
		return k;
	}
}
