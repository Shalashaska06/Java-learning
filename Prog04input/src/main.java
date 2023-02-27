import java.util.Scanner;

// Ne JAMAIS oublier cet import ci-dessus

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*On déclare "scanner" comme étant la variable qui initie le scan, on peut, en réalité
		 * mettre ce qu'on veux.
		 */
		
		System.out.println(" Entre votre nom: ");
		String name = scanner.nextLine();
		System.out.println("Ainsi que ton age ");
		int age = scanner.nextInt();
		scanner.nextLine();
		/*Lorsqu'on tente de faire un scanner next.Line après un next.Int le programme skip la commande
		*Ceci est dû au fait que le next.Line prend en considération un \n invisible dans le nextInt
		*il est donc nécessaire de lire ce \n en utilisant "dans le vide" un next.Line
		*/
		System.out.println("Quelle est ta nourriture préférée ?");
		String bouffe = scanner.nextLine();
		
		
		
		System.out.print("Salut "+name);
		System.out.print(" tu as "+age+" ans");
		System.out.println(" tu aime " +bouffe);
	}

}
