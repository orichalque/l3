public class FormatUS implements FormatDate {
	
	public String displayDate(Time t) {
		return(t.month()+"/"+t.day()+"/"+t.year());
	}
}
