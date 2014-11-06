public class Octal extends Decorator {
	public Octal(Entier e){
		super(e);
	}
	
	public int base() {
		int k = n;
		String s = Integer.toOctalString(k);
		k = s;
		return k;
	}
}
