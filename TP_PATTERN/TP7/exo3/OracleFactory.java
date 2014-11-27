class OracleFactory extends Factory {
	public OracleFactory() {
	}
	
	public Connexion creerConnexion(boolean secu) {
		
		return (secu) ? new OracleSecu() : new OracleN();
	}
}
