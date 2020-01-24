import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	int num = 0;
	Random ran = new Random();
	num = ran.nextInt(100);
	
	
	int numb = 0;
	numb = ran.nextInt(100);
	
	
	int three = 0;
	three = ran.nextInt(100);
	
	
	int four =0;
	four = ran.nextInt(100);
	
	
	int five = 0;
	five = ran.nextInt(100);
	
	
	
	
	
	
	
	
	System.out.println(num + numb + three + four + five);
	JOptionPane.showMessageDialog(null,"The winning numbers are : " + num +" "+ numb + " "+ three +" "+ four +" "+ five+" " );
}
	
	
}
