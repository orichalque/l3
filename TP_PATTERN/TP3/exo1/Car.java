public class Car {
	protected State s;
	
	public Car() {
		s = getOff();
	}
	
	public State getOff() {
		return new StateOff(this);
	}
	
	public State getOn() {
		return new StateOn(this);
	}
	
	public State getGo() {
		return new StateGo(this);
	}
	
	public void setState(State s_) {
		s = s_;
	}
	public void pressButton() {
		s.pressButton();
	}
	
	public void enterAdress() {
		s.enterAdress();
	}
}
