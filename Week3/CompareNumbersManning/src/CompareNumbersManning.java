import java.util.Scanner;

public class CompareNumbersManning {
	//Erica Manning
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			double number1 = in.nextDouble();
			
			System.out.print("Enter another number: ");
			double number2 = in.nextDouble();
			
			boolean equalTo = number1 == number2;
			boolean greaterThan = number1 > number2;
			boolean lessThan = number1 < number2;
			
			System.out.println(number1 + " is equal to " + number2 + ": " + equalTo);
			System.out.println(number1 + " is greater than " + number2 + ": " + greaterThan);
			System.out.println(number1 + " is less than " + number2 + ": " + lessThan);
			
			
	}
}
