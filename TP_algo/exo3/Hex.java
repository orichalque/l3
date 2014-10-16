class Hex {
	
	protected int x;
	protected int y;
	protected int etq;
	protected int rpz;
	protected boolean chosen;
	protected int player;
	
	public int rpz() {
		return rpz;
	}
	
	public void union(Hex a) {
		rpz = a.rpz;
		chosen = true;
	}	
	
	public void setPlayer(int i) {
		player = i;
	}
	public Hex(int x_,int y_,int etq_) {
		x = x_;
		y = y_;
		etq = etq_;
		rpz = etq;
		player = 0;
		chosen = false;
	}
	
	public String color() {
		if (player == 1) { 
			return new String("X");
		} else if (player == 2) { 
			return new String("8");
		} else { 
			return new String("O"); 
		} 
	}
	
	public void data(int x_,int y_,int etq_) {
		x = x_;
		y = y_;
		etq = etq_;
	}
	
	public int getEtq() {
		return etq;
	}
	
}
