import java.util.Scanner;
import java.text.DecimalFormat;
public class MidtermManning {
	//Erica Manning
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Enter First Name: ");
		String firstName = in.nextLine();
		firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
		
			boolean enterAnother = true;
			while(enterAnother) {
				
				if (firstName.equals("ZZZ")) {
					enterAnother = false;
					break;	
				}
				
				System.out.println("Enter Total Sales: ");
				double totalSales = in.nextDouble();
				
				System.out.println("Press y for all-star, n for non-all-star: ");
				String allStarCheck = in.next();
				
				System.out.println(firstName + " - $"  + df.format(bonusCalculator(allStarCheck, totalSales)));
				
				System.out.println("Please enter another name or ZZZ to quit: ");
				firstName = in.next();
				firstName =Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1);
			}
			
			in.close();
			
			System.out.println("Goodbye");
		
	}
	
	/**
	 * calculates the salesperson's bonus
	 * @param allStarCheck determines if the salesperson is an all-star or not which determines bonus percent
	 * @param totalSales determines the salesperson's total sales
	 * @return the bonus earned
	 */
	public static double bonusCalculator(String allStarCheck, double totalSales) {
		double bonusAmount = 0.02;
		double bonusTotal = 0;
		
		if (allStarCheck.equals("y")) {
			bonusAmount = 0.03;
		}
		
		bonusTotal = totalSales * bonusAmount;
		
		return bonusTotal;
		
	
	}
}
