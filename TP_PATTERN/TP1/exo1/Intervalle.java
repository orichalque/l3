class Intervalle {
	protected int min;
	protected int max;
	
	public Intervalle(int _min, int _max){
		min = _min;
		max = _max;
	}
	
	public int plage() {
		return max-min;
	}
	
	public int min() {
		return min;
	}
	
	public int max() {
		return max;
	}
	
	public void setMin(int _min) {
		min = _min;
	}
	
	public void setMax(int _max) {
		max = _max;
	}	
}
