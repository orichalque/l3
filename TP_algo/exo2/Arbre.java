public class Arbre {
	private Noeud rac;
	
	/* ############# Constructor  ###############*/
	
	public Arbre() {
		rac = null;
	}
	
	public Arbre(Noeud k) {
		rac = k;
	}
	
	/* ############### Methods ############### */
	
	public boolean empty() {
		return (rac.empty());
	}
	
	public void display(Noeud n) {
		if (n != null && !n.empty()) {
			if (n.haveLeft()) {
				System.out.print('(');
				display(n.getLeft());
				System.out.print(n.getElt());
				display(n.getRight());
				System.out.print(')');
			} else {
				System.out.print(n.getElt());
			}
		}
	}
	
	public int height(Noeud n) {
		if (!n.haveLeft() && !n.haveRight()){ //leaf -> return 0
			return 0;
		}
		if (n.haveRight() && n.haveLeft()) { //Have 2 son -> return the highest height between 'em
			return (1+Math.max(height(n.getRight()), height(n.getLeft())));
		} else if (n.haveLeft()) { //Have only 1 left son 
			return (1+height(n.getLeft())); 
		} else {
			return(1+height(n.getRight()));
		}
	}
}
