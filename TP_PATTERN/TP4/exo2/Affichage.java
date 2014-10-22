import java.util.*;

public class Affichage extends Observer{
	protected Vector<Donnee> historique;
	
	public Affichage(Sujet suj) {
		super(suj);
		historique = new Vector<Donnee>();
	}
	
	public void update(Donnee d_) {
		historique.add(d);
		d = d_;
	}
	
	public void afficher() {
		d.aff();
	}
	
	public void moyenne() {
		double mt = 0;
		double mh = 0;
		double mp = 0;
		int i; Donnee a;
		/*for (i = 1; i < historique.size(); ++i) {
			a = historique.get(i);
			a.aff();
			mt += a.getT();
			mh += a.getH();
			mp += a.getP();
		}*/
		++i;
		System.out.println("Moyenne : Temperature: "+(mt/i)+" Pression: "+(mp/i)+" Humidité: "+(mh/i));
	}
	
}
