import java.util.Scanner;
public class PrintStarsManning {
	//Erica Manning
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("How many rows of stars would you like printed? ");
		int numberOfRows = in.nextInt();
		
		do {
			System.out.println("*****");
			i++;
		}
		while(i<numberOfRows);
		
	}
}
