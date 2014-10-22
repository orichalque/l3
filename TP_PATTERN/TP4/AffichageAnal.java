import java.text.*;
import java.util.*;


public class AffichageAnal extends Observer {
	public AffichageAnal(Sujet s) {
		super(s);
	}
	
	public void afficher() {
		DateFormat dateFormat = new SimpleDateFormat("ss:mm:HH");
		System.out.println(dateFormat.format(d));
	}
}
