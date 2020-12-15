import java.util.Scanner;

public class HalfFullManning {
	//Erica Manning
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 100: ");
		
		int numberEntered = in.nextInt();
		
		if (numberEntered < 50) {
			System.out.println("The glass is half empty.");
		}
		else {
			System.out.println("The glass is half full.");
		}
		
		
	}
}
