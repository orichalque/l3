public class StateReserved extends State {
	public StateReserved(Reservation r){
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
		System.out.println("Veuillez confirmer votre réservation avant tout paiement.");
	}
	
	public void confirm() {
		bill.setState(bill.getConfirm());
		System.out.println("Billet confirmé! Vous pouvez payer. ");
	}
}
