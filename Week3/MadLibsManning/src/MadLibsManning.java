
import java.util.Scanner;

public class MadLibsManning {
	//Erica Manning
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in); 
		
		System.out.print("Enter a name: ");
		String person = in.nextLine();
		
		String firstLetterPerson = person.substring(0,1);
		firstLetterPerson = firstLetterPerson.toUpperCase();
		
		int length = person.length();
		String restPerson = person.substring(1, length);
		restPerson = restPerson.toLowerCase();
		
		System.out.print("Enter a number: ");
		String age = in.nextLine();
		
		System.out.print("Enter a food: ");
		String food = in.nextLine();
		food = food.toLowerCase();
		
		System.out.print("Enter a drink: ");
		String drink = in.nextLine();
		drink = drink.toLowerCase();
		
		System.out.print("Enter a number: ");
		String numberOfPeople = in.nextLine();
		
		System.out.print("Enter an object: ");
		String object1 = in.nextLine();
		object1 = object1.toLowerCase();
		
		System.out.print("Enter another object: ");
		String object2 = in.nextLine();
		object2 = object2.toLowerCase();
		
		System.out.print("Enter an adjective: ");
		String adj = in.nextLine();
		adj = adj.toLowerCase();
		
		
		System.out.println(firstLetterPerson + restPerson + " had a birthday party today! " + firstLetterPerson + restPerson + " turned " + age + " years old! At the birthday party there was yummy " + food + " to eat and " + drink + " to drink! There were nearly " + numberOfPeople + " people there and I saw a " + object1 + " and a " + object2 + ". " + firstLetterPerson + restPerson + "'s birthday party was so " + adj + ". It was so much fun!" );
		
		
		
		
	}
}
