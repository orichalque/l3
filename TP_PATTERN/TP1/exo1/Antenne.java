class Antenne{
	protected int identifiant;
	protected Position position;
	protected Intervalle inter;
	
	//Constructor
	public Antenne(int id, Position pos, int freqMin, int freqMax) {
		identifiant = id;
		position = pos;
		inter = new Intervalle(freqMin, freqMax);
	}
	
	public Antenne(Antenne ant) {
		identifiant = ant.getId();
		position = ant.getPos();
		inter = ant.getInter();
	}
	
	/* SETTER */	
	public void setId(int id) {
		identifiant = id;
	}

	public void setPos(Position pos) {
		position = pos;
	}
	
	public void setFreqMin(int freq) {
		inter.setMin(freq);
	}
	
	public void setFreqMax(int freq) {
		inter.setMax(freq);
	}
	
	public void setInter(Intervalle _int) {
		inter = _int;
	}
	
	/* GETTER */
	public Position getPos() {
		return position;
	}
	
	public int getId() {
		return identifiant;
	}
	
	public int min() {
		return inter.min();
	}
	
	public int max() {
		return inter.max();
	}
	
	public double getX() {
		return position.getX();
	}
	
	public double getY() {
		return position.getY();
	}	
	
	public Intervalle getInter() {
		return inter;
	}
	
	/* METHODS */
	public String toString() {
		String str = identifiant+":["+min()+"-"+max()+"]@("+position.getX()+","+position.getY()+")";
		return str;
	}
	
	public double dist(Antenne ant) {
		double distance = Math.sqrt(Math.pow((getX() - ant.getX()), 2) + Math.pow((getY() - ant.getY()), 2));
		return distance;
	}
	
	public int plage() {
		return (max() - min());
	}
	
	public void getPlage() {
		System.out.println("Plage de frequence: "+plage()+" MHz");
	}
}
