
public class main {

	public static void main(String[] args) {
		
		String[][] vroums = new String [3][3];
		
		vroums[0][0] = "R34";
		vroums[0][1] = "CLK";
		vroums[0][2] = "S-Type";
		vroums[1][0] = "Serie 4";
		vroums[1][1] = "911";
		vroums[1][2] = "Miata";
		vroums[2][0] = "Tiguan";
		vroums[2][1] = "Touareg";
		vroums[2][2] = "Passat";
		
		
	/*
	 * Ou bien on peut faire:
	 * 
	 * 
	 * String[][] vroums = 	{	{"R34","CLK","S-Type"},
	 * 							{"Serie 4","911","Miata"},
	 * 							{"Tiguan","Touareg","Passat"};
	 * 						}
	 * 
	 * 
	 * 
	 * 
	 * 	
	 */
		
		
		for (int i = 0; i<vroums.length; i++) {
			
			System.out.println();
			
			for(int j = 0; j<vroums[i].length; j++)
			
			System.out.print(vroums[i][j]+"     ");
		}
		
		

	}

}
