public class StateGo extends State {
	public StateGo(Car c) {
		super(c);
	}
	
	public void pressButton() {
		System.out.println("Shrrrriiiiiiiiik !!! Shrhrbrbrrlvrrr ... *off*");
		car.setState(car.getOff());
	}
}
