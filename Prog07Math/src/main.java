
public class main {

	public static void main(String[] args) {
		
	}
		
		double pi = 3.14;
		double y = -10;
		
		double z = Math.max(pi, y);
		double a = Math.min(y, z);
		double v = Math.abs(y);
		double q = Math.sqrt(pi);
		double r = Math.round(pi);
		double c = Math.ceil(pi);
		double f = Math.floor(pi);
		
		System.out.println("la valeur la plus grande est : "+z);
		System.out.println("la valeur la plus petite est : " +a);
		System.out.println("la valeur absolue de y est : " +v);
		System.out.println("la racine carrée de pi vaut: " +q);
		System.out.println("Pi arrondi vaut : " +r);
		System.out.println("Pi arrondi vers le haut vaut : " +c);
		System.out.println("Pi arrondi vers le bas vaut : " +f);
		
	}

}
