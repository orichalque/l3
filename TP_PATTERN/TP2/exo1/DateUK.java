public class DateUK extends Date {
	
	public DateUK(Time t) {
		super(t);
		form = new FormatUK();
	}
}
