public class Cryptor {
	protected Hashor hash;
	
	public Cryptor(Hashor h) {
		hash = h;
	}
	
	public String crypt(String s) {
		return hash(s);
	}
}
