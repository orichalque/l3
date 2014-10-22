import java.util.*;
import java.text.*;

public abstract class Sujet {
	protected Vector<Observer> o;
	protected Date d;
	
	public Sujet() {
		o = new Vector<Observer>();
		d = new Date();
	}
	
	public void add(Observer o_) {
		o.add(o_);
	}
	
	public void remove(Observer o_){
		o.remove(o_);
	}
	
	public void notifier() {
		for (Observer t : o) {
			t.notify(d);
		}
	}
	
	public void update() {
		d = new Date();
		notifier();
	}
}
