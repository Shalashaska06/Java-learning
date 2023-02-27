
public class main {

	public static void main(String[] args) {
	
		int perdu;
		int amis = 9;
		System.out.println("tu as " +amis+ " amis !");
		
		amis = amis + 1;

		System.out.println("un ami s'est ajoute...");
		
		System.out.println("tu as " +amis+ " amis ! ");
		
		amis*=2;
		
		System.out.println("Pleins d'amis s'ajoutent ! ");
		
		System.out.println("tu as mainteant " +amis+ "amis !");
		
		System.out.println("Oh non on doit faire des groupes de 3");
		
		perdu = amis%3;
		
		System.out.println(+perdu+ " amis sont seuls");
		
		amis-=perdu; 
		
		System.out.println("il te reste " +amis+ " amis");
		
		amis/=2;
		System.out.println("Oh non la moitié de tes amis ne sont pas du même bord politique que toi !");
		System.out.println("il ne te reste plus que " +amis+ " amis");
		
		

	}

}
