import java.util.Random;

import javax.swing.JOptionPane;

public class checkpoint {
public static void main(String[] args) {
	//int num = 0;
	//Random ran = new Random();
	//num = ran.nextInt(1000);
	//System.out.println(num);
	//int numb = 0;
	//Random rand = new Random();
	//numb = rand.nextInt(900);
	//JOptionPane.showMessageDialog(null, num + numb);
	//JOptionPane.showMessageDialog(null, num - numb);
	//less than 2 cups go to store to buy more
	//ask user how many cups of flour they have
	
	
	//String flour = JOptionPane.showInputDialog("How many cups of flour do you have?");
	//int cups = Integer.parseInt(flour);
	//if (cups >= 2) {
		//JOptionPane.showMessageDialog(null, "You don't have to go to the store to buy more!");
	//}
	//else {
		//JOptionPane.showMessageDialog(null, "Go to the store and buy more cups!");
	
	//}
	//ask how many people of cookies they are going to give
	//if bake for more than 30 u have to bake more than 2 batches
	String people = JOptionPane.showInputDialog("How people are you going to bake cookies for?");
	int cookies = Integer.parseInt(people);
	if (cookies >= 30) {
		JOptionPane.showMessageDialog(null, "Bake 2 more batches of cookies!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Awesome! You don't have to bake anymore batches!");
	}
}
}
