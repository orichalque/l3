public class Reservation {
	protected State state;
	
	public Reservation() {
		state = getVoid();
	}
	
	public State getPaid() {
		return new StatePaid(this);
	}
	
	public State getVoid() {
		return new StateVoid(this);
	}
	
	public State getReserved() {
		return new StateReserved(this);
	}
	
	public State getConfirm() {
		return new StateConfirm(this);
	}
	
	public void setState(State s) {
		state = s;
	}
	
	public void confirm() {
		state.confirm();
	}
	
	public void pay() {
		state.pay();
	}	
	
	public void modify() {
		state.modify();
	}
	
	public void cancel() {
		state.cancel();
	}
	
	public void go() {
		state.go();
	}
	
	public void reserv() {
		state.reserv();
	}
}
