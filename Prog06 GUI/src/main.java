import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
	
		String name = JOptionPane.showInputDialog("Entre ton nom bg");
		JOptionPane.showMessageDialog(null, name+" ? C'est un nom de gigachad " );
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Entre ton age bg"));
		JOptionPane.showMessageDialog(null, age+" ans ! vu ton age tu es dans le printemps de la jeunesse !");
				
		
		float taille = Float.parseFloat(JOptionPane.showInputDialog("quelle est ta taille de chad ?"));
		JOptionPane.showMessageDialog(null, taille+ "m est une vraie taille de giga chad");
		
		Double zizi = Double.parseDouble(JOptionPane.showInputDialog("Et quelle est ta taille de...?"));
		JOptionPane.showMessageDialog(null, zizi+ "cm ??? eh bah... pas mal..");
	}
}
