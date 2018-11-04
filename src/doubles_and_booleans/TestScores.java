package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		
		String Score = JOptionPane.showInputDialog("What was your test score?");
		
		
		double score2 = Double.parseDouble(Score);
		
		if (score2>80.00) {
			JOptionPane.showMessageDialog(null, "wow you really studied hard!");
		}
		else if (score2<79.99) {
			JOptionPane.showMessageDialog(null, "You could have used some more studying");
		}
	}
}
