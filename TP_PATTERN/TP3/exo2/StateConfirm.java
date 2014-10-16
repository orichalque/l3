public class StateConfirm extends State {

	public StateConfirm(Reservation r) {
		super(r);
	}
	
	public void cancel() {
		System.out.println("Billet annulé.");
		bill.setState(bill.getVoid());
	}
	
	public void modify() {
		System.out.println("Informations modifiées !");
	}
	
	public void pay() {
		System.out.println("Billet payé.");
		bill.setState(bill.getPaid());
	}
	
}
