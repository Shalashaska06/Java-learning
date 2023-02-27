import java.util.Scanner;
import java.util.scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez la valeur de a");
		a = scanner.nextDouble();
		System.out.println("Entrez la valeur de b");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b)); 
		
		System.out.println("L'hypotenuse vaut : " +c);
		
		scanner.close();
		
		

	}

}
