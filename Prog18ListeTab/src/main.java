import java.util.ArrayList;


public class main {

	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> nourriture = new ArrayList<String>();
		
		nourriture.add("Pizza");
		nourriture.add("Lasagne");
		nourriture.add("Pasta");
		
		nourriture.set(0,  "Couscous"); //remplace une valeur dans une place du tab
		nourriture.remove(2); //retire une valeur du tableau
		//nourriture.clear(); // permet de retirer toutes les valeurs du tableau
		
		
		
		for(int i=0; i<nourriture.size(); i++) {
			System.out.println(nourriture.get(i));
		}
		
	}
	
}
