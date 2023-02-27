import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		
		
		
		int temp = 26;
		
		if(temp>30) {
		
			System.out.println("wesh y fait cho");
		}
		
		else if(temp>=20 && temp<=30) {
			
			System.out.println("il fait grave bon");
		
		}
		else {
			System.out.println("fait pas tres chaud");
		}
		
		

		
		
	Scanner sca = new Scanner(System.in);
	
	System.out.println("Vous jouez à un jeu appuyez sur q pour quitter");
	
	String reponse = sca.next();
	
	if(reponse.equals("q") || reponse.equals("Q")) {
		System.out.println("Vous avez quitte le jeu, a bientot");
	}
	
	else {
		System.out.println("Vous jouez toujours !");
		
	}
	
	
		
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Vous jouez à un jeu appuyez sur q pour quitter");
		String reponse = sca.next();
		
		if(!reponse.equals("q") && !reponse.equals("Q")) { //Si "reponse" est différent de q et de Q alors on affiche la ligne suivante
			System.out.println("Vous jouez encore *BNZJBZB*");
		}
		
		else {
			System.out.println("Vous nous quittez deja ? :(");
			
		}
	
		
		
	}
}
