public class Moto implements Vehicule {
	protected Roue[] roues;
	protected Moteur moteur;
	
	public Moto(Roue[] _roues, Moteur _moteur) {
		roues = _roues;
		moteur = _moteur;
	}
	
	public Roues[] getRoues() {
		return roues;
	}
	
	public Moteur getMoteur() {
		return moteur;
	}
	
	public void setRoues(Roue[] roux) {
		roues = roux;
	}
	
	public void setMoteur(Moteur mot ) {
		moteur = mot;
	}
	
	public String composition {
		System.out.println("C'est une moto ... ? "); //c'est pas ça
	}
}
