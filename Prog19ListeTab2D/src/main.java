import java.util.*;



public class main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> MagasinList = new ArrayList();
		
		
		ArrayList<String> BoulangerieList = new ArrayList();
		BoulangerieList.add("baguette");
		BoulangerieList.add("tartines");
		BoulangerieList.add("donuts");	

		ArrayList<String> ProduitsList = new ArrayList();
		ProduitsList.add("tomates");
		ProduitsList.add("penne");
		ProduitsList.add("sel");	
		
		ArrayList<String> BoissonList = new ArrayList();
		BoissonList.add("coca");
		BoissonList.add("the");
		
		
		MagasinList.add(BoulangerieList);
		MagasinList.add(ProduitsList);
		MagasinList.add(BoissonList);
		
		
		
		System.out.println(MagasinList);
		System.out.println(MagasinList.get(2).get(0));
		
	}

}
