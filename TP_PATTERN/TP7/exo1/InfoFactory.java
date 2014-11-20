public class InfoFactory extends Factory  {
	InfoFactory(Cours c) {
		super(c);
	}
	
	public void choixSalle() {
		cours.setSalle(new SalleInfo());
	}
	
	public void choixProf() {
		cours.setProf(new ProfInfo());
	}
}
