public class DateISO extends Date {
	
	public DateISO(Time t) {
		super(t);
		form = new FormatISO();
	}
}
