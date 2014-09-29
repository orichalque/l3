class Simulateur {
	public static void main (String args[] ) {
		Date f = new DateUS(new Time(2011, 4, 25));
		f.displayDate();
		f.setFormatDate(new FormatISO());
		f.displayDate();	
		f.setFormatDate(new FormatUK());
		f.displayDate();
	}
}
