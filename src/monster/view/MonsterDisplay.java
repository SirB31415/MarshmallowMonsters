package monster.view;

import javax.swing.JOptionPane;


public class MonsterDisplay
//	The displayText is set with the JOptionPane default showMessageDialog command which creates a window. The null means that no one owns the window right now. The textToDisplay makes it so that we have certain things displayed in the window. 
{
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
		
	}
	public String getResponse(String questionToDisplay) {
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, questionToDisplay);
		
		return answer;
		
	}
}
