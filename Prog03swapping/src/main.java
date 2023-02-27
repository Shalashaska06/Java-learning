
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "Chaise";
		String y = "Tabouret";
		String temp=null; //temp est vide
		
//on commence le swapping
		
		temp=x; //temp n'est plus vide mais contient x (Chaise)
		x=y; //x prend la valeur de y car x est dans temp donc nous pouvons l'écraser
		y=temp; //y prend la valeur de temp (anciennement x) et donc aura la valeur initiale de x
		
		System.out.println("Je m'assieds sur un(e) " +x);
		System.out.println("Je n'aime pas les " +y);
		
	}

}
