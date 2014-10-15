public class StateFree {
	public StateFree(Property p) {
		super(p);
	}
	
	public void buy(Player p) {
		System.out.println(p.getName()+" achète la propriété "+property_.getName()+" .");
		property_.setOwner(p);
		property_.setState(property_.getStateOwned());
	}
	
	public void rent(Player p) {
		System.out.println(" Vous ne pouvez louer une propriété dont vous n'êtes propriétaire. Achetez la avant.");
	}
	
	public void sell(Player p) {
		System.out.println("Vous ne pouvez vendre une propriété dont vous n'êtes propriétaire, achetez la avant.");
	}
}
