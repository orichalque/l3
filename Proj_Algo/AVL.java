import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class AVL/*<E>*/ {
	//protected Noeud<E> rac;
	
	public AVL() {
	}
	
	public void readFile(String[] file) {
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 			String page = "";
			br = new BufferedReader(new FileReader(file));
			while ((sCurrentLine = br.readLine()) != null) {
				page += sCurrentLine+" ";
			}
			
			/* Purification du texte, on retire les caractères pénibles à gérer */
			page = page.replaceAll("[().,;?!:']", " ");
			page = page.replaceAll("[éè]", "e");
			page = page.replaceAll("à", "a");
			page = page.replaceAll("ç", "c");
			
			String[] pageSplit = page.split(" ");
			/* Découpe de la page suivant les espaces */
			for (String s : pageSplit) {
				/* et on retire les espaces comme ça pas d'ennuis de comparaisons avec la classe string */
				s = s.replace(" ", "");
				s = s.replace("\n", "");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args){
		System.out.println(args[0]);
		AVL e = new AVL();
		e.readFile("fichier.java");
	}
}
