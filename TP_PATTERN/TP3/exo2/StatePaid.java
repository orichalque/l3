public class StatePaid extends State {
	public StatePaid(Reservation r) {
		super(r);
	}
	
	public void modify() {
		System.out.println("Billet confirmé et payé, les informations ne peuvent être modifiées");
	}
	
	public void go() {
		System.out.println("Bon voyage !");
		bill.setState(bill.getVoid());
	}
}
