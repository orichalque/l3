class Noeud<E extends Comparable<E>> {

	protected E etq;
	protected Noeud<E> leSon;
	protected Noeud<E> riSon;
	protected int nbFils;
	protected int bal;

	// CONSTRUCTEUR
	// public Noeud<E>();
	public Noeud(E base) {
		etq = base;
		nbFils = 0;
		leSon = null;
		riSon = null;
		bal = 0;
	}

	public void affecter(Noeud<E> B) {
		etq = B.etq;
		nbFils = B.nbFils;
		leSon = B.leSon;
		riSon = B.riSon;
		bal = B.bal;
	}

	public Noeud<E> getRiSon() {
		return riSon;
	}

	public Noeud<E> getLeSon() {
		return leSon;
	}

	public void setBal(int i) {
		bal = i;
	}

	public boolean isLeaf() {
		return (! haveRson() && ! haveLson());
	}

	public boolean isFull() {
		return (haveRson() && haveLson());
	}

	public boolean haveRson() {
		return (riSon != null);
	}

	public boolean haveLson() {
		return (leSon != null);
	}

	public int addSon(E x) { // on ajoute sur un arbre non vide => constructeur
		nbFils++;
		int h;
		if (x != etq) {
			if (x.compareTo(etq) > 0) {
				if (riSon != null) {
					return riSon.addSon(x);
				} else {
					riSon = new Noeud(x);
					return 1;
				}
			} else {
				if (leSon == null) {
					leSon = new Noeud(x);
					return -1;
				} else {
					h = leSon.addSon(x);
					h = -h;
					if (h == 0) {
						return 0;
					} else {
						bal = bal + h;
						equilibrer();
						if (bal == 0) {
							return 0;
						} else {
							return 1;
						}
					}
				}

			}
		} else {
			return 0;
		}

	}

	public int height() {
		assert (this != null);
		if (isLeaf()) {
			return 0;
		} else {
			int rightH, leftH;
			rightH = (haveRson()) ? riSon.height() : 0;
			leftH = (haveLson()) ? leSon.height() : 0;
			return (1 + Math.max(rightH, leftH));
		}
	}

	public int balance() {
		return riSon.height() - leSon.height();
	}

	public int getBalance() {
		return bal;
	}

	public void ROTD() {
		Noeud<E> k = leSon;
		int a = bal;
		int b = k.getBalance();
		leSon = k.getRiSon();
		k.riSon = this; /* Rotation */
		setBal(a - Math.max(b, 0) - 1);
		k.setBal(Math.min(a - 2, Math.min(a + b - 2, b - 1)));
	}

	public void ROTG() {
		Noeud<E> k = riSon; // b <- fils droit
		int a = balance();
		int b = k.balance();
		riSon = k.getLeSon();
		k.leSon = this; /* Rotation */
		setBal(a - Math.max(b, 0) - 1);
		k.setBal(Math.min(a - 2, Math.min(a + b, b - 1))); // La noeud droit de
															// l'objet est
															// devenu racine.
	}

	public void DROTG() {
		riSon.ROTD();
		ROTG();
	}

	public void DROTD() {
		leSon.ROTG();
		ROTD();

	}

	public void equilibrer() {
		if (bal == 2) {
			if (riSon.bal >= 0) {
				ROTG();
			} else {
				riSon.ROTD();
				ROTG();
			}
		} else if (bal == -2) {
			if (leSon.bal >= 0) {
				ROTD();
			} else {
				leSon.ROTD();
				ROTD();
			}
		}
	}

	public int supp(E x) { // A MODIFIER COMME ADD
		if (this != null) {
			int h;
			if (x.compareTo(etq) > 0) {
				h = riSon.supp(x);
			} else if (x.compareTo(etq) < 0) {
				h = leSon.supp(x);
				h = -h;
			} else if (! haveLson()) {
				// variation = -1
				return -1;
			} else if (! haveRson()) {
				// variation = -1
				return -1;
			} else {
				etq = riSon.mini();
				h = riSon.oterMin(); // vrairation H prend variation de otermin
			}
			if (h != 0) {
				bal = bal + h;
				equilibrer();
				if (bal == 0) {
					// variationH = -1
					return -1;
				} else {
					return 0;
				}
			} else {
				return 0;
			}

		} else {
			return 0;
		}

	}

	public int oterMin() { // A FAIRE COMME ADD
		int mini;
		int h;
		if (! haveLson()) {

			affecter(riSon);
			return -1;
		} else {
			h = leSon.oterMin();
			h = -h;
		}
		if (h == 0) {
			return 0;
		} else {
			bal = bal + h;
			equilibrer();
			if (bal == 0) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public E mini() {
		assert(this != null) ;
			if (! haveLson()) {
				return etq;
			} else {
				return leSon.mini();
			}
		
	}

	public void affichage() {
		if (this != null) {
			System.out.println(etq.toString() + " " + height());
			if (haveRson()) {
				riSon.affichage();
			}
			if (haveLson()) {
				leSon.affichage();
			}

		}
	}

	public static void main(String[] args) {
		Noeud<Integer> rac = new Noeud(5);
		rac.affichage();
		rac.addSon(4);
		rac.affichage();
		rac.addSon(6);
		rac.affichage();
		rac.addSon(8);
		rac.affichage();
		rac.addSon(10);
		rac.affichage();

	}

}

