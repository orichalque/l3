public class StateRented {
	
	public StateRented(Property p) {
		super(p);
	}
	
	public void sell() {
		System.out.println("Vous ne pouvez vendre une propriété dont vous n'êtes que locataire.");
	}
	
	public void sell(Player p) {
		if (p == property_.getRenter()) {
			System.out.println("Vous vendez la propriété à son locataire.");
			property_.setRenter(new Player());
			property_.setOwner(p);
			property_.setState(property_.getStateOwned());
		} else {
			System.out.println("Vous ne pouvez vendre une propriété avec un locataire. Virez le avant.");
		}
	}
	
	public void leave() {
		System.out.println(property_.getRenter().getName()+" rompt son contrat de location de la propriété "+property_.getName()+" appartenant à "+property_.getOwner().getName()+" .");
		property_.setRenter(new Player());
		property_.setState(property_.getStateOwned()); //back to sold state
	}
	
	public void buy(Player p) {
		if (p = property_.getOwner()) {
			System.out.println("Cette propriété vous appartient déjà !");
		} else {
			System.out.println("Cette propriété appartient déjà à quelqu'un !";)
		}
	}
	
	public void rent(Player p) {
		if (p = property_.getRenter()) {
			System.out.println("Vous louez déjà cette propriété!");
		} else {
			System.out.println("Cette propriété est déjà louée par quelqu'un !";)
		}
	}	
}
