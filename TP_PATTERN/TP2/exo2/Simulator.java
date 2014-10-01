
public class Simulator {
	public static void main( String[] args){
		Cryptor cryptr = new Cryptor(new SHA512());
		String s = cryptr.crypt("lollol");
		System.out.println(s);
	}
}
