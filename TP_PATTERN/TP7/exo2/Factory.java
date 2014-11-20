abstract class Factory {
	protected Carte c;
	
	public Factory(Carte c_) {
		c = c_;
	}
	
	public abstract Lettre create();

}
