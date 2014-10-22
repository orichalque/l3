import java.text.*;
import java.util.*;


public class AffichageNum extends Observer {
	public AffichageNum(Sujet s) {
		super(s);
	}
	
	public void afficher() {
		DateFormat dateF = new SimpleDateFormat("HH:mm:ss");
		System.out.println(dateF.format(d));
	}
}
