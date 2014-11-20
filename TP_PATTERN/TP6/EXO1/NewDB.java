import java.util.vector;

class abstract NewDB {

	protected Vector<Molecule> db;
	protected int nb;
	
	public NewDB() {
		db = new Vector<Molecule>();
		nb = 0;
	}
	
	public void add(Molecule m) {
		db.add(m);
	}
	
	public Molecule newMol(String s) {
		for (Molecule m : db) {
			if (m.getNom().equals(s)) {
				return m;
			}
		}	
	}
}
