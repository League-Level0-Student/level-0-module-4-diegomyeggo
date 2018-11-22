package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		int adventure = JOptionPane.showOptionDialog(null, "What do you want to do today?", "adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Go outside", "Go bak to sleep" }, null);
	if (adventure==0) {
		goutside();
	}
	else if (adventure==1) {
		JOptionPane.showMessageDialog(null, "You went back to bed and slept all day");
	}
	
		
	}
	
	
static void goutside () {
 int outside = JOptionPane.showOptionDialog(null, "Where do you want to go?", "Outside", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Go to the store" , "Go back inside" }, null);

	if (outside==0) {
		
	}
	}

}