import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int lignes;
		int colonnes;
		String symbole = "";
		
		
		System.out.println("Entrez le nombres de lignes voulues");
		lignes = scan.nextInt();
		
		System.out.println("Entrez le nombres de colonnes voulues");
		colonnes = scan.nextInt();
		
		System.out.println("Entrez le symbole a utiliser");
		symbole = scan.next();
		
		for(int i=1; i<=lignes; i++) {
			System.out.println();
			for(int j=1; j<=colonnes; j++) {
				System.out.print(symbole);
			}
			
		}

	}

}
