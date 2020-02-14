import javax.swing.JOptionPane;

public class parse {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog("Enter a number");
	

		int num = Integer.parseInt(quantity);
		if (num == 1) {
			System.out.println("Good!");
		}
		else {
			System.out.println("GG");
		}
		
		
		
		
		
	}

}
