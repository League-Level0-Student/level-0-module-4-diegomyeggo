package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {

String score=JOptionPane.showInputDialog("What is your test score?");
int score2 = Integer.parseInt(score);
if (score2<=6) {
	JOptionPane.showMessageDialog(null, "You should have studied more");

if (score2>=10) {
		JOptionPane.showMessageDialog(null, "Great job, you studied");
	}
else {
	JOptionPane.showMessageDialog(null, "");
}
}
}
}