import java.util.Scanner;
public class ChildcareChargesManning {
	//Erica Manning
	public static void main(String [] args) {
		int rates[][] = {      	{30, 60, 88, 115, 140},
                				{26, 52, 70, 96, 120},                 
                				{24, 46, 67, 89, 110},
                				{22, 40, 60, 75, 88},
                				{20, 35, 50, 66, 84} };
		
		System.out.println("Your total cost is: $" + determineChildCareCharges(rates));
		
	
	}
	
	/**
	 * determines the cost of child care
	 * @param rates array of rates depending on age and days per week
	 * @return the charge 
	 */
	
	public static int determineChildCareCharges (int rates[][]) {
		int charge = 0;
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter the age of the child: ");
		int age = in.nextInt();
		
		
		while (age >= 0 && age < 5) {
			System.out.print("Enter the number of days per week attending daycare: ");
			int daysPerWeek = in.nextInt();
			
			charge = charge + rates[age][daysPerWeek-1];
			
			System.out.println("Enter another age or 999 to exit: ");
			age = in.nextInt();
		}
		
		in.close();
		
		return charge;
	}
}
