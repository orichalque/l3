class Adapter implements NewDB {
	
	private OldDB db;
	
	public Adapter(OldDB db_) {
		super();
		db = db_;
	}	
	
	public Molecule newMol(String name) {
		return db.oldMol(name);
	}
}
