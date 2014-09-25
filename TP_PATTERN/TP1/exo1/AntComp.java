import java.util.Comparator;

public class AntComp implements Comparator<Antenne> {
	
	@Override
	public int compare(Antenne a1, Antenne a2) {
		int p1 = a1.plage(); 
		int p2 = a2.plage();
		
		if ( p1 == p2 ) {
			return 0;
		} else if ( p1 < p2 ) {
			return -1;
		} else {
			return 1;
		}
	}
}
