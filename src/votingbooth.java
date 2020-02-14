import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int num = Integer.parseInt(age);
	if (num >= 18) {
		JOptionPane.showInputDialog("Who should the next president be?");
	
	}
	else {
		JOptionPane.showMessageDialog(null, "You opinion doesn't matter!");
	}
	
	
	
	
}
}
