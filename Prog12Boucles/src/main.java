import java.util.Scanner;


public class main {

	public static void main(String[] args) {
				
				
		Scanner scanner = new Scanner(System.in);
		String name = "";
		String surname = "";
		
				
			while(name.isBlank()) {
				System.out.println("Veuillez entrer votre nom");
				name = scanner.nextLine();
					
			}
				
			System.out.println("Salut " +name+ " aka le gros bg");
		
		
			
			do {
				System.out.println("Et quel est ton surnom ? ");
				surname = scanner.nextLine();
					
			}while(surname.isBlank());
			
			System.out.println("Je t'appelerais donc " +surname);
		
	}

}
