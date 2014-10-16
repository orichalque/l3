public class Simulator {
	public static void main(String[] args) {
		Reservation r = new Reservation();
		r.reserv();
		r.confirm();
		//r.cancel(); //fonctionne
		r.modify();
		r.pay();
		r.go();
	}
}
