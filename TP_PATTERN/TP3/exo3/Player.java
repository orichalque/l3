public class Player {
	protected String name_;
	protected int money_;
	
	public Player(String n) {
		name_ = n;
		money = 2000;
	}
	
	public Player() {
		name_ = "";
		money = 0;
	}
	
	public String getName() {
		return name_;
	}
	
	public String getMoney() {
		return money_;
	}
	
	public void looseMoney(int m) {
		money_ = money_ - m;
	}
	
	public void winMoney(int m) {
		money_ = money + m;
	}
}
