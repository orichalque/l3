class Dictionnaire {
	protected String[] mots;
	
	public Dictionnaire(String file, int nbMots) {
		
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
			mots = new String[length(pageSplit)];
			int i = 0;
			/* Découpe de la page suivant les espaces */
			for (String s : pageSplit) {
				/* et on retire les espaces comme ça pas d'ennuis de comparaisons avec la classe string */
				s = s.replace(" ", "");
				s = s.replace("\n", "");
				mots[i] = s;
				++i; //ajout des mots au dictionnaire TABLEAU PAS OP
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

}
