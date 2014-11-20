import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		InputStream in = new FilterInputStream(read);
		in = new ReverseInputStream(in);
	}
}
