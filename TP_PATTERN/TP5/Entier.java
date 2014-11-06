public abstract class Entier {
	protected int n;
	
	public Entier() {
	}
	
	public void setInt(int k) {
		n = k;
	}
	public int base() { return n;}
	
	public void aff() {
		System.out.println(n);
	}
}
