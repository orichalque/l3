import java.util.vector;

abstract class OldDB {
	protected Vector<Molecule> db;
	protected int nb;
	
	public OldDB() {
		db = new Vector<Molecule>();
		nb = 0;
	}
	
	public void add(Molecule m) {
		db.add(m);
	}
	
	public Molecule oldMol(String s) {
		for (Molecule m : db) {
			if (m.getNom().equals(s)) {
				return m;
			}
		}
		return new Molecule();	
	}
}
