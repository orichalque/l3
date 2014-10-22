import java.util.*;
import java.text.*;
import java.lang.*;


public class Simulateur {
	public static void main(String[] args) {
		Sujet s = new Horloge();
		Observer o = new AffichageNum(s);
		s.add(o);
		Observer p = new AffichageAnal(s);
		s.add(p);
		
        
		while (true) {
			for (int i = 0; i < 10; i++) {
				try {
   					Thread.sleep(1000);
				} catch(InterruptedException e) {
    				System.out.println("Erreur ! Tu l'as dans le");
				}
				s.update();
				o.afficher();
			}
			System.out.println("Affichage Analogique: ");
			p.afficher();
		}
	}
}
