class Facade {
	protected Salle s;
	protected Retroprojecteur r;
	protected Multiprise m;
	protected Videoprojecteur v;
	protected Ordi o;
	
	public Facade() {
		s = new Salle("Salle");
		r = new Retroprojecteur("Retro");
		m = new Multiprise("Multiprise");
		v = new Videoprojecteur("Videoprojecteur");
		o = new Ordi("Ordinateur");
	}
	
	public void debut() {
		s.allumer();
		m.allumer();
		o.allumer();
		v.allumer();
	}
	
	public void fin() {
		s.eteindre();
		m.eteindre();
		o.eteindre();
		v.eteindre();
	}
}
