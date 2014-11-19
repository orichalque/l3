class Main {
	public static void main(String[] args) {
		Boisson b = new Cafe(1.25);
		b = new Chocolat(b);
		b = new Sucre(b);
		
		System.out.println(b.prix());
	}
}
