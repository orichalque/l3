public abstract class Observer {
	Sujet suj;
	Donnee d;
	
	public Observer(Sujet s) {
		suj = s;
		s.add(this);
	}
	
	public void update(Donnee d_) {
		d = d_;
	}
	
	public void afficher() {}
	public void moyenne(){}
}
