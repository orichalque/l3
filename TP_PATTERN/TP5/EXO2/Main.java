class Main {
	public static void main(String [] args) {
		BMW a = new BMW325();
		a = new Cuir(a);
		a = new GPS(a);
		a = new Couleur(a);
		
		System.out.println(a.cout());
	}
}
