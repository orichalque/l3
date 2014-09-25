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
		if(rac == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void display(Noeud n) {
		if (!n.empty()) {
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
}
