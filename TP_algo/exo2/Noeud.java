class Noeud {
	private char elt;
	private Noeud left, right;
	
	/* ############# Constructor  ###############*/
	
		
	public Noeud() {
		elt = 0;
		left = null;
		right = null;
	}
	
	public Noeud(char a) {
		elt = a;
		left = null;
		right = null;
	}
	
	public Noeud( char c, Noeud l, Noeud r) {
		elt = c;
		left = l;
		right = r;
	}
	
	
	/* ################ Setters ################*/
	
	public void setElt(char i) {
		elt = i;
	}
	
	public void addRight(Noeud r) {
		right = r;
	}
	
	public void addLeft(Noeud l) {
		left = l;
	}
	
	/* ############### Getters ################ */
	
	public Noeud getRight() {
		return right;
	}
	
	public Noeud getLeft() {
		return left;
	}
	
	public char getElt() {
		return elt;
	}
	
	/* ############### Methods ############### */

	public boolean haveRight() { // check if having a right son
		return (right != null);
	}
	
	public boolean haveLeft() { // check if having a left son
		return (left != null);
	}
	
	public boolean empty() {
		if (elt == 0) {
			return true;
		} else {
			return false;
		}
	}
}
