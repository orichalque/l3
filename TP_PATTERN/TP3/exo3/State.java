public abstract class State() {
	protected Property property_;
	
	public State(Property p) {
		property_ = p;
	}
	
	public void buy(Player p);
	public void sell();
	public void sell(Player p);
	public void rent(Player p);
	public void leave();
}
