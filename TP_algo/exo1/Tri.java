class Tri {
	protected int[] t;
	int sz;
	
	Tri(int k) {
		sz = k;
		t = new int[k];
		for (int i = 0; i < k; i++) {
			t[i] = 0;
		}
	}
	
	public int[] get() {
		return t;
	}
	
	public void add(int j) {
		int i = 0;
		while (t[i] != 0) {
			i++;
		}
		t[i] = j;
	}
	
	public void display() {
		for (int i = 0; i < sz; i++ ) {
			if (t[i] != 0 ){
				System.out.print(t[i]+" ");
			}	
		}
	}
	
	public void triFusion(int tab[]) {
		int lng = tab.length;
		if (lng > 0) {
			triFusion(tab, 0, lng -1);
		}
	}
	
	public void triFusion(int tab[], int deb, int fin) {
		if (deb != fin) {
			int milieu = (deb+fin)/2;
			triFusion(tab, deb, milieu); //tri fusion sur 1ere moitié
			triFusion(tab, milieu+1, fin); //tri fusion sur 2eme moitié
			fusion(tab, deb, milieu, fin); //on recolle les bouts
		}
	}
	
	public void fusion(int tab[], int deb1, int fin1, int fin2) {
		int deb2 = fin1+1;
		//on recolle les éléments du début du tableau
		int tab1[] = new int[fin1-deb1+1];
		for (int i = deb1; i <= fin1; i++) {
			tab1[i-deb1] = tab[i];
		}
		int cpt1 = deb1;
		int cpt2 = deb2;
		for (int i = deb1; i <=fin2; i++) {
			if (cpt1 == deb2) { //tous les elt du premier tab sont utilisés
				break; //du coup c'est classé
			} else if(cpt2 == (fin2+1)) { //les elt du tableau 2 sont classés aussi
				tab[i] = tab1[cpt1-deb1]; //ajout des elt restants du 1er tab
				cpt1 ++;
			} else if (tab1[cpt1-deb1] < tab[cpt2]) { 
				tab[i] = tab1[cpt1-deb1]; //ajout d'un elt du premier tableau
				cpt1 ++;
			} else {
				tab[i] = tab[cpt2]; // ajout d'un elem du second tableau
				cpt2++;
			}
		}
	}
	
	
}

