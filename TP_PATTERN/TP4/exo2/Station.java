public class Station extends Sujet {
	public Station() {
		super();
	}
	
	public void update() {
		double t = 5+Math.random()*(25-5); /*5°C to 25°C */
		double h = 50+Math.random()*(100-50); /* 50% to 100% */
		double p = 950+Math.random()*(1050-950); /* 950 to 1050 hPa */
		d = new Donnee(p, h, t);
		notifier();
	}
}
