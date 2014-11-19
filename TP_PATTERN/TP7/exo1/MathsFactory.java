public class MathsFactory extends Factory  {
	public MathsFactory(Cours c) {
		super(c);
	}
	
	public void choixSalle() {
		cours.setSalle(new SalleMaths());
	}

	public void choixProf() {
		cours.setProf(new ProfMaths());
	}
}

