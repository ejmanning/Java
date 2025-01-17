//import java.util.Scanner;
public class EFScaleManning {
	//Erica Manning
	public static void main(String [] args) {

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the 3 second wind gust in MPH: ");
		
		if (in.hasNextInt()) {
			int gust = in.nextInt();
			
			if (gust >= 65) {
				System.out.println("EF Rating = " + returnEFValue(gust));
			}
			else
				System.out.println("Not a valid input. Please enter a number greater than 65.");
		}
		else {
			System.out.println("Not a valid input. Please enter a number.");
		}
	}
	
	public static int returnEFValue(int gust) {
		int EFValue = 0;
		
		if (gust >= 65 && gust <= 85) {
			EFValue = 0;
		}
		else if (gust >= 86 && gust <= 110) {
			EFValue = 1;
		}
		else if (gust >= 111 && gust <= 135) {
			EFValue = 2;
		}
		else if (gust >= 136 && gust <= 165) {
			EFValue = 3;
		}
		else if (gust >= 166 && gust <=200) {
			EFValue = 4;
		}
		else if (gust > 200) {
			EFValue = 5;
		}
				
		return EFValue; 
	} 
}
