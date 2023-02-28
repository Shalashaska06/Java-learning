import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		
		//String[] animaux = {"chat", "chien", "souris", "oiseau"};
		
		ArrayList<String> animaux = new ArrayList<String>();
		
		animaux.add("chat");
		animaux.add("chien");
		animaux.add("souris");
		animaux.add("oiseau");
		
		
		for(String i : animaux) {
			System.out.println(i);
			
			
//le for each permet d'itérer dans un tableau de manière plus simple et rapide
//cepedant c'est beaucoup moins flexible qu'un for classique
			
//ici le i va être itérer à chaque tour de boucle permettant donc de traverser le tableau

			
		}
		

	}

}
