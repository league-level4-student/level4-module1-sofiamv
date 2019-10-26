package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice){
		case "Sunday":
		JOptionPane.showMessageDialog(null, "Sunday is a weekend");
		break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Saturday is a weekend");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Monday is a weekday.");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Tuesday is a weekday.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Wednesday is a weekday.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "Thursday is a weekday.");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Friday is a weekday.");
			break;
		}
	}
}
