public abstract class State{
	protected Reservation bill;
	
	public State(Reservation r) {
		bill = r;
	}
	public void modify(){}
	public void reserv(){}
	public void confirm(){}
	public void pay(){}
	public void go(){}
	public void cancel(){}
}
