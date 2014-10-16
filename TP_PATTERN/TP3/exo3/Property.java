public class Property {
	protected String name_;
	protected String owner_;
	protected String renter_;
	protected int price_;
	protected int fee_;
	protected State state_;
	
	public Property(String n, int p, int f) {
		name_ = n;
		owner_ = "";
		renter_ = "";
		price_ = p;
		free_ = f;
		state_ = new StateFree();
	}
	
	/*Getters*/
	public String getName() {
		return name_;
	}
	
	public int getPrice() {
		return price_;
	}
	
	public int getFee() {
		return fee_;
	}
	/*------*/
	
	/*Setters*/
	public void setOwner(Player p) {
		owner_ =  p;
	}
	
	public void setRenter(Player p) {
		renter_ = p;
	}
	/*------*/
	
	/*State Methods*/
	public void setState(State s){ 
		state_ = s;
	}
	
	public State getRented() {
		return new StateRented(this);
	}
	
	public State getOwned() {
		return new StateOwned(this);
	}
	
	public State getFree() {
		return new StateFree(this);
	}
	/*------*/
}
