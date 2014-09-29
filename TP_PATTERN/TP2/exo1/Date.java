public abstract class Date {
	protected FormatDate form;
	protected Time time;
	
	public Date(Time t) {
		time = t;
	}
	
	public void setFormatDate(FormatDate f) {
		form = f;
	}
	
	public void displayDate() {
		System.out.println(form.displayDate(time));
	}
}
