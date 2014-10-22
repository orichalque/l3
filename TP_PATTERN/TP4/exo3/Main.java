import java.util.*;
import java.net.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws Exception {
		System.out.println("Debut");
		/*
		URL url = null ;
		try {
			url = new URL("http://finance.yahoo.com/d/quotes.csv?s=^FCHI+^IXIC+^N225&f=l1");
		} catch(MalformedURLException e) {
			System.out.println("Erreur ouverture lien");
		}
		BufferedReader in = null;
		try {
			in = new BufferedReader(
					new InputStreamReader(url.openStream()));
		} catch (IOException e) {
			System.out.println("Erreur lecture fichier");
		}
		String inputLine;
		try {
			while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
			}	
		} catch (IOException e)   {
			System.out.println("Erreur");
		}
		try {	
			in.close();
		} catch (IOException e) {
			System.out.print("Erreur");
		} */
		
		URL url = new URL("http://finance.yahoo.com/d/quotes.csv?s=^FCHI+^IXIC+^N225&f=l1");
		BufferedReader in = null;
		in = new BufferedReader(
					new InputStreamReader(url.openStream()));
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
				System.out.println(inputLine);
		}
		in.close();		
	}
}
