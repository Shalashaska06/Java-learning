
public class main {

	public static void main(String[] args) {
		
		
		String nom = " Shalashaska "; 
		
		boolean resultat = nom.equalsIgnoreCase("shalashaska");
		//Crée un booleen qui compare la string "nom" et la terme entré en argument
		System.out.println(resultat);
		
		int longueure = nom.length();
		//Montre la longueur du string
		System.out.println(longueure);
		
		char index = nom.charAt(3);
		//Montre la lettre située à l'index approprié (ici 3)
		System.out.println(index);
		
		int lettre =nom.indexOf("l");
		//Montre l'index de la lettre appropriée 
		System.out.println(lettre);
		
		boolean vide = nom.isEmpty();
		//Crée un booleen qui vérifie si le String est vide ou non
		System.out.println(vide);
		
		String maj = nom.toUpperCase();
		//Converti les lettres du String en maj
		System.out.println(maj);
		
		String minuscule = nom.toLowerCase();
		//Converti en minuscule
		System.out.println(minuscule);
		
		String espace = nom.trim();
		//Supprime les espaces du string
		System.out.println(espace);
		
		String replace = nom.replace('a', 'k');
		//remplace touts les caractères mentionné par d'autres
		System.out.println(replace);
		
		

	}

}
