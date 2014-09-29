public class DateUS extends Date {
	
	public DateUS(Time t) {
		super(t);
		form = new FormatUS();
	}
}
