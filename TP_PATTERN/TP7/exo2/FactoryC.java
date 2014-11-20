class FactoryC extends Factory {
	
	public FactoryC(Carte c_) {
		super(c_);
	}
	
	public Lettre create() {
		if (c.isCB()) {
			return new LettreV(c);
		} else if (c.isMC()) {
			return new LettreM(c);
		} else {
			return new LettreA(c);
		}
	}
}
