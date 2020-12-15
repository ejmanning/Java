import java.util.Scanner;
	public class CompareNamesManning {
		public static void main(String [] args) {
			
			Scanner input = new Scanner(System.in);
		
			System.out.print("Enter a name: ");
			String name1 = input.nextLine();
			
			System.out.print("Enter another name: ");
			String name2 = input.nextLine();
			
			boolean result = name1.equalsIgnoreCase(name2);
			
			System.out.println("These names are the same: " + result);
		
		
	}
	
}

