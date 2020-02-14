import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?(Inches)");
	int num = Integer.parseInt(height);
	if (num >= 48 ) {
		JOptionPane.showMessageDialog(null, "You are tall enough to ride this rollercoaster!");
	}
	else {
		JOptionPane.showMessageDialog(null, "You aren't tall enough to ride this rollercoaster!");
	}
	
	
	
	
	
	
	
}
}
