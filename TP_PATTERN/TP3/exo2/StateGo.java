public class StateGo extends State {
	public StateGo(Reservation r) {
		super(r);
	}
	
	public void go() {
		System.out.println("Bon voyage !");
	}
}
