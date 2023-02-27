import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		//Random ale = new Random();
		
		//int age = ale.nextInt(90)+1;//Les randoms étaient là pour que je m'exerce
		
		System.out.println("Quel age as-tu ?");
		
		
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
	
		
		System.out.print("tu as " +age+ "ans, ");
		
		if(age>=75) {
			
			System.out.println("ok boomer");
		}
		
		else if(age>=18){
			
			System.out.println("tu es majeur!");
		}
		
		else if(age<=3) {
			System.out.println("googoogaga ?");
		}
		
		else {
			System.out.println("tu es mineur!");
		}
		
		

	}

}
