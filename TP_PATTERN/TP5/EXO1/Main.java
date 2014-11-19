public class Main {
	public static void main(String [] args) {
		Entier n = new EntierConcret(50);
		n = new Binaire(n);
		System.out.println(n.base());
		
	}
}
