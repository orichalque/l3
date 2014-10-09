public class StateOn extends State {
	public StateOn(Car c) {
		super(c);
	}
	
	public void enterAdress() {
		car.setState(car.getGo());
		System.out.println("Swoooooooosh");
	}
	
	public void pressButton() {
		System.out.println("Vrr rr vrrr rr ... *off*");
		car.setState(car.getOff());
	}
}
