import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp;
		Tri T = new Tri(20);
		for (int i = 0; i < 20; i++) {
			tmp = sc.nextInt();
			T.add(tmp);
		}
		T.display();
		Tri K = new Tri(1);
		K.triFusion(T.get());
		System.out.println();
		T.display();
	}
}
