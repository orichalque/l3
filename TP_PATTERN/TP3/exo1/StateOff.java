public class StateOff extends State {
	public StateOff(Car c) {
		super(c);
	}
	
	public void pressButton() {
		car.setState(car.getOn());
		System.out.println("... Vrr ... Vrrrr ... VrrrrVrrrVrr-- *On*");
	}
}
