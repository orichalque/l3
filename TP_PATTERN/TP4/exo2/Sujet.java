import java.util.*;

public abstract class Sujet {
	protected Donnee d;
	protected Vector<Observer> o;
	
	public Sujet() {
		o = new Vector<Observer>();
	}
	
	public void add(Observer O) {
		o.add(O);
	}
	
	public void remove(Observer O) {
		o.remove(O);
	}
	
	public void notifier() {
		for (Observer k : o) {
			k.update(d);
		}
	}
	
	public void update() { }
}
