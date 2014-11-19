abstract class Decoration extends Boisson {
	Boisson boisson;
		
	public Decoration(Boisson b) {
		boisson = b;
	}
	
	public double getTaille(){
		return boisson.getTaille();
	}
	
	public double prix () {
		return (boisson.getTaille()* cout + boisson.prix());
	}	
	
}	
