package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
  String nickle = JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
 int Nick = Integer.parseInt(nickle);

		// Ask the user how many dimes they have, and convert their answer
String dime =JOptionPane.showInputDialog("How many dimes do you have?");
int dime2 = Integer.parseInt(dime);

		// Ask the user how many quarters they have, and convert their answer
String quarter =JOptionPane.showInputDialog("How many quarters do you have?");
int quart =Integer.parseInt(quarter);

double val = (Nick/20.00 + dime2/10.00 + quart/4.00);

		// Calculate how much money the user has and save it in a double variable 


// Tell the user how much money they have
JOptionPane.showMessageDialog(null, val);
	}
}

