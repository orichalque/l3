public class StateVoid extends State {
	public StateVoid(Reservation r) {
		super(r);
	}
	
	public void reserv() {
		System.out.println("Billet reservé");
		bill.setState(bill.getReserved());
	}
}
