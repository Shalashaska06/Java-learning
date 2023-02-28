
public class mainreturn {

	public static void main(String[] args) {
		
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);
//ici z est une variable locale cad que elle n'est pas liée à la variable z de la fonction add
//on aurait très bien pu l'appeler w ou k ou iuzejchzuen ça n'a pas d'importance
		System.out.println(z);
//Pas besoin nécessairement de stocker la valeur que l'on veut retourner
		System.out.println(add(x,y));

	}

	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
//On peut ici retourner aussi uniquement x + y au lieu de stocker la valeur dans une var

		
		
		
	}
	
}
