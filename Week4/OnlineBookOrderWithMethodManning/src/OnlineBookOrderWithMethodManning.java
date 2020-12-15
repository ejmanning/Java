import java.text.DecimalFormat;
import java.util.Scanner;

public class OnlineBookOrderWithMethodManning {
	//Erica Manning
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("This program will include tax and shipping to calculate the total price for books bought.");
		
		System.out.print("Enter the number of books purchased: ");
		int numberOfBooks = in.nextInt();
		
		System.out.print("Enter the subtotal: ");
		double bookSubtotal = in.nextDouble();
		
		
		System.out.println("Number of books purcahsed: " + numberOfBooks);
		System.out.println("Book subtotal: $" + bookSubtotal);
		System.out.println("");
		System.out.println("Order Total: $" + df.format(getTotal(numberOfBooks, bookSubtotal)));
		
		
		in.close();
		
		
	}
	/**
	 * computes the total amount including shipping and taxes
	 * @param numberOfBooks amount of books purchased
	 * @param bookSubtotal subtotal without shipping and taxes
	 * @return the total including shipping and taxes
	 */
	
	
	
	public static double getTotal(int numberOfBooks, double bookSubtotal) {
		final double PERCENT_TAX = 0.055;
		double taxAmount = (bookSubtotal * PERCENT_TAX);
		final double SHIPPING_CHARGE = 1.5;
		double shippingAmount = SHIPPING_CHARGE * numberOfBooks;
		double orderTotal = bookSubtotal + taxAmount + shippingAmount;
		return orderTotal;
	}
}