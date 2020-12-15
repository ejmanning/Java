import java.util.Scanner;

public class BadArrayIndexManning {
	//Erica Manning
	public static void main(String [] args) {
		String firstNames[] = {"Erica", "Joseph", "Cindy", "Stan", "Emily", "Hannah", "Megan", "Nick", "Tatum", "Cody"};
		String number;
		
			try {
				System.out.println("Please, enter a number from 1 to 10 to display a name in the array: ");
				
				Scanner in = new Scanner(System.in);
				
				number = in.nextLine(); 
				int i = Integer.parseInt(number);
				i = i-1;
				
				System.out.println(firstNames[i]);
				in.close();
				
			}
			
			catch (ArrayIndexOutOfBoundsException exception) {
				System.out.println("The number you entered is out of range");
			}
		
	}
}
