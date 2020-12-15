import java.util.Scanner;

public class CompareNumbersManning {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		
		String message="";
		
		System.out.print("Enter a number: ");
		double number1 = in.nextDouble();
		
		System.out.print("Enter another number: ");
		double number2 = in.nextDouble();
		
		if (number1 == number2) {
			message = number1 + " is equal to " + number2;
		}
		else if(number1 > number2) {
			message = number1 + " is greater than " + number2;
		}
		else if(number1 < number2) {
			message = number1 + " is less than " + number2;
		}
	
		System.out.println(message);
		
	}
}
