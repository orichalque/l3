public class ChimieFactory extends Factory  {
	ChimieFactory(Cours c) {
		super(c);
	}
	
	public void choixSalle() {
		cours.setSalle(new SalleChimie());
	}
	
	public void choixProf() {
		cours.setProf(new ProfChimie());
	}
}
