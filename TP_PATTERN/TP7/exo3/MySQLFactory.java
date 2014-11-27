class MySQLFactory extends Factory {
	public MySQLFactory() {
	}
	 
	public Connexion creerConnexion(boolean secu) {
		return (secu) ? new MySQLSecu() : new MySQLN();
	}
}
