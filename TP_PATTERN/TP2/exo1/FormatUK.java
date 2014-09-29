public class FormatUK implements FormatDate {
	
	public String displayDate(Time t) {
		return(t.day()+"/"+t.month()+"/"+t.year());
	}
}
