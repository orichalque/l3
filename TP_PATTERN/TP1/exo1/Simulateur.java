import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Simulateur {
	public static void main (String[] args) {
		Antenne ant = new Antenne(5, new Position(1,1), 200,500);
		Antenne ant2 = new Antenne(25, new Position(5,5), 2900,3000);
		Antenne ant3 = new Antenne(22, new Position(5,8), 950,2000);
		
		System.out.println(ant.dist(ant2));
		System.out.println(ant.toString());
		ant.getPlage();
		
		Set<Antenne> set = new TreeSet<Antenne>(new AntComp());
		
		set.add(ant);
		set.add(ant2);
		set.add(ant3);
		
		System.out.println(set.toString());
	}
}
