public class Donnee {
	protected double p;
	protected double h;
	protected double t;
	
	public Donnee(double P, double H, double T) {
		p = P;
		t = T;
		h = H;
	}
	
	public void aff() {
		System.out.println("Pression Atmosphérique: "+p+" hPa");
		System.out.println("Humidité "+h+"%");
		System.out.println("Température "+t+"°C");
	}
	
	public double getT() {
		return t;
	}
	
	public double getH(){
		return h;
	}
	
	public double getP() {
		return p;
	}
}
