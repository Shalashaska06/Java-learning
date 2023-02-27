import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int j;
		
		
		String[] vroum = {"R34", "CLK", "S-Type", "Serie 4"};
		
		System.out.println("Choisir un modele parmis les suivants");
		
		for(j=0; j<vroum.length; j++) {
		
		System.out.println(vroum[j]);
		
	}
			
			
		String modele = scan.nextLine();

		
		switch(modele) {

		case "R34": System.out.println("Felicitation c'est un R34 V8 2.5L !");
		break;

		case "CLK": System.out.println("Félicitation c'est un clk V6 2L !");
		break;
		
		case "S-Type": System.out.println("felicitation c'est un S-Type V6 1.7L !");
		break;
		
		case "Serie 4": System.out.println("Felicitation c'est une serie 4 V6 2.3L !");
		break;
		
		case "r34": System.out.println("Felicitation c'est un R34 V8 2.5L !");
		break;

		case "clk": System.out.println("Félicitation c'est un clk V6 2L !");
		break;
		
		case "s-type": System.out.println("felicitation c'est un S-Type V6 1.7L !");
		break;
		
		case "serie 4": System.out.println("Felicitation c'est une serie 4 V6 2.3L !");
		break;
		
		default : System.out.println("Veuillez selectionner un modele parmis ceux proposés.");
		
		
		
			
			
			
			
		}
}
	
	
}
