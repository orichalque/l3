import java.text.*;
import java.util.*;

public abstract class Observer {
	protected Sujet suj;
	protected Date d;
	
	public Observer(Sujet s) {
		suj = s;
		suj.add(this);
	}
	
	public void notify(Date d_) {
		d = d_;
	}
	
	public abstract void afficher();
}
