public abstract class Decorator extends Entier {
	Entier k;
	
	public Decorator(Entier k_) {
		super();
		k = k_;
	}
	
	public int base() { return 0;
	}
}
