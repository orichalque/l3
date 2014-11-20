class Main {
	public static void main(String [] args) {
		Facade f = new Facade();
		Prof p = new Prof(f);
		
		p.debut();
		
		p.fin();
	}
}
