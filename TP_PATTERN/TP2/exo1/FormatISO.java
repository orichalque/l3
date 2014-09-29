public class FormatISO implements FormatDate {
	
	public String displayDate(Time t) {
		return(t.year()+"-"+t.month()+"-"+t.day());
	}
}
