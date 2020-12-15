import java.util.Scanner;
public class AverageAgeManning {
	public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
				System.out.println("How many people would you like to enter: "); //prompts the user for amount of people
				
				int amountOfPeople = in.nextInt(); //gets the amount of people and saves as variable
				
				int peopleTotal = amountOfPeople; //gets peopleTotal to use in the equation
				
				int totalCombinedAge = 0; //declares variable
				
				//while the amount of people is greater than zero do this
				while (amountOfPeople > 0) {
					System.out.print("Enter an age: "); //prompts user for age
					int personAge = in.nextInt(); //gets age 
					totalCombinedAge += personAge; //continues to add ages together
					amountOfPeople--; //decreases the amount of people for while loop to work
				}
					
				double averageAge = (double)totalCombinedAge / peopleTotal; //equation for average
			
				System.out.println("The average age is " + averageAge); //prints message
					
					
	}
}

