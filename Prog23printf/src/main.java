
public class main {

	public static void main(String[] args) {
		
		
		//System.out.printf(" Voici un String format %d ",123);
		
		boolean monBooleen = true;
		char monchar = '@';
		String monString = "Shaska";
		int monInt = 06;
		double mondouble = 1000;
		
		
		/*System.out.printf(" %b ", monBooleen);
		System.out.printf(" %c ", monchar);
		System.out.printf(" %s ", monString);
		System.out.printf(" %d ", monInt);
		*/
		
/*
		System.out.printf("Coucou %10s ", monString);
			//le 10 dans %10s mets 10 charactères entre le coucou et monString
				//mettre un "-" permet de mettre ces caractères après la phrase
		
		System.out.printf(" Voici votre argent %.2f ",mondouble);
			//le .2 permet de limiter le nombre de chiffres après la virgule ici .2 pour 2 
*/
		
/*		System.out.printf("Voici votre argent %+f",mondouble);
			//le "+" permet d'afficher le signe du nombre, qu'il soit négatif ou positif
		
		System.out.printf("Voici votre argent %030f",mondouble);
			//le "0" permet, à l'instar du 10 plus haut, de padder des 0 avant le nombre
*/
		
		
		System.out.printf("Voici votre argent %,f",mondouble);
			//La virgule permets simplement de ponctuer les chiffres
		
		
		
		
		
		
		
		
	}

}
