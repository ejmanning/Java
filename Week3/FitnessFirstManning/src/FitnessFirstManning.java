import java.util.Scanner;

import javax.swing.JOptionPane;

public class FitnessFirstManning {
	//Erica Manning
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		String ID = JOptionPane.showInputDialog("Enter your gym member ID"); //asks for ID
		ID = ID.toUpperCase(); //changes ID input to all uppercase
		String formattedID = ID.substring(0,2) + "-" + ID.substring(2,5) + "-" + ID.substring(5); //formats ID with dashes
		
		String inputMinutes = JOptionPane.showInputDialog("Enter the number of minutes for your massage: "); //asks for minutes
		int minutes = Integer.parseInt(inputMinutes); //changes minutes input to int form (since it can only take String you have to change it after)
		
		int hours = minutes/60; //calculates hours
		int mins = minutes%60; //calculates minutes
		
		JOptionPane.showMessageDialog(null, "Thank you, Member " + formattedID + " for your massage reservation for " + hours + " hour(s) and " + mins + " minutes."); //displays final message
		
		in.close();
		
		
		
		
		
	}

}
