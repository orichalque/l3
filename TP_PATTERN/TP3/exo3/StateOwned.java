public class StateOwned {
	
	public StateOwned(Property p) {
		super(p);
	}
	
	public void sell() {
		property_.setOwner(new Player());
		property_.setState(property_.getStateFree());
	}
	
	public void sell(Player p) {
		if (property_.getOwner() != p) {
			System.out.println(property_.getOwner().getName()+" vend sa propriété "+property_.getName()+" a "+p.getName()+" .");
			property_.setOwner(p);	
		} else {
			System.out.println("Pourquoi vendre la propriété à vous-même? La taxe afférente à la vente de cette propriété ne vous rendrait que perdant dans l'affaire");
		}	
	}
	
	public void leave() {
		System.out.println("Si vous n'en voulez plus, vendez la propriété.");
	}
	
	public void rent(Player p) {
		System.out.println(property_.getOwner().getName()+" loue sa propriété "+property_.getName()+" a "+p.getName()+" .");
		property_.setRenter(p);
		property_.setState(property_.getStateRented());
	}
	
	public void buy(Player p) {
		if (p = property_.getOwner()) {
			System.out.println("Cette propriété vous appartient déjà !");
		} else {
			System.out.println("Cette propriété appartient déjà à quelqu'un !";)
		}
	}	
}
