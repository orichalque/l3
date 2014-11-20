abstract class Boisson {
	protected double taille;
	double cout;
	
	public double getTaille() {
		return taille;
	}
	
	public double prix() { 
		return (taille*cout);		
	}
}
