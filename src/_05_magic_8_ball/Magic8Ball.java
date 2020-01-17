//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int num = 0;
Random ran = new Random();
num = ran.nextInt(4);
	// 3. Print out this variable
System.out.println(num);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Enter a question");
	// 5. If the random number is 0
if (num == 0) {
	JOptionPane.showMessageDialog(null, "Yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (num == 1) {
	JOptionPane.showMessageDialog(null, "No");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (num == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (num == 3) {
	JOptionPane.showMessageDialog(null, "Only the superiors will know this answer");
}
	// -- write your own answer
}
}
