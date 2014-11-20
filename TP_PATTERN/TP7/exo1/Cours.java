class Cours {
	protected Factory factory;
	protected Salle salle;
	protected Prof prof;
	protected String cours;
	
	public Cours(String s) {
		cours = s;
		if ( s.equals("maths")) {
			factory = new MathsFactory(this);
		} else if (s.equals("info")) {
			factory = new InfoFactory(this);
		} else if (s.equals("chimie")) {
			factory = new ChimieFactory(this);
		}
		factory.choixProf();
		factory.choixSalle();
	}
	
	public String getCours() {
		return cours;
	}
	
	public Salle getSalle() {
		return salle;
	}
	
	public Prof getProf() {
		return prof;
	}
	
	public void setProf(Prof p) {
		prof = p;
	}
	
	public void setSalle(Salle s) {
		salle = s;
	}
	
	public void display() { 
		System.out.println(salle.getNom()+" : "+prof.getNom()+" "+prof.getPrenom());
	}
	
}
