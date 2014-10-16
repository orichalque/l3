import java.util.Scanner;

class Table {
	protected static Hex[][] table;
	protected int size;
	protected int player;
	
	//constructeur
	public Table() {
		player = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisir taille");
		int input = sc.nextInt(); 
		table = new Hex[input][input];
		size = input; //Size of the square
		int etq = 0;
		for (int i = 0; i < (input); i++) {
			for (int j = 0; j < (input) ; j++) {
				table[i][j] = new Hex(i, j, etq);
				etq ++;
			}
		}
	}
	
	//Choix de la case a selectionner & selection
	public void pick() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Abscisse ?");
		int i = sc.nextInt(); i--;
		System.out.println("Ordonnée ?");
		int j = sc.nextInt(); j--;
		
		if (table[i][j].getPlayer() == 0) { //pion non selectionné
			table[i][j].setPlayer(player);	
		} else {
			System.out.println("Pion déjà séléctionné ! Tu feras plus attention la prochaine fois.");
		}
		
		if (player == 1) {
				player = 2;
			} else {
				player = 1;
		}
		display();
	}
	
	public void union(i,j) {
		boolean spec = false;
		if (i == 0) { //tout à droite
		} else if (j == 0) { //tout en haut
		} else if (j == size -1) { //tout en bas
		} else if (i == size -1) { // à gauche 
		} 
		
	}
	//Affichage
	public void display() {
		String a = "";
		for (int i = 0; i < size; i ++) {
			for(int j = 0; j < size; j++) {
				a = table[i][j].color();
				System.out.print("["+a+"]");
			}	
			System.out.println();
		}
	}
	
	/* Main */
	public static void main(String[] args) {
		Table t = new Table();
		t.display();
		t.pick();
	}
}
