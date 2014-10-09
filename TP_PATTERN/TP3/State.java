public abstract class State {
	protected Car car;
	
	public State(Car c) {
		car = c;
	}
	
	public void pressButton() {	}
	public void enterAdress() { }
	
}
