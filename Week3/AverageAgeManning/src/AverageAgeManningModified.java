import java.util.Scanner;

public class AverageAgeManningModified {
	public static void main(String[] args) {
		final int NUMBER_OF_AGES=4;
		
		
			Scanner in = new Scanner(System.in);
				System.out.println("This program will calculate the average age of four people");
				
				System.out.print("Enter an age for person 1: ");
				int person1Age = in.nextInt();
				
				System.out.print("Enter an age for person 2: ");
				int person2Age = in.nextInt();
			
				System.out.print("Enter an age for person 3: ");
				int person3Age = in.nextInt();
				
				System.out.print("Enter an age for person 4: ");
				int person4Age = in.nextInt();
				
				int totalCombinedAge = person1Age + person2Age + person3Age + person4Age;
				
				double averageAge = (double) (totalCombinedAge) / NUMBER_OF_AGES;
		
				System.out.println("The average age of the family is " + averageAge);
				
				
	}
}
