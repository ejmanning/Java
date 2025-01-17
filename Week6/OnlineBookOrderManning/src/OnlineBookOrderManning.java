import java.text.DecimalFormat;
import java.util.Scanner;

public class OnlineBookOrderManning {
	//Erica Manning
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		double bookSubtotal = 0;
			
		System.out.println("This program will include tax and shipping to calculate the total price for books bought.");
			
		System.out.print("Enter the number of books purchased: ");
		int numberOfBooks = in.nextInt();
		
		int totalNumberOfBooks = numberOfBooks;
		
		for(int i = 1; i <= numberOfBooks; i++) {
			System.out.print("Enter the price for book " + i + ": ");
			double tempBookSubtotal = in.nextDouble();
			bookSubtotal += tempBookSubtotal;
			
		}
			
		System.out.println("");
		System.out.println("Number of books purchased: " + totalNumberOfBooks);
		System.out.println("Book subtotal: $" + df.format(bookSubtotal));
		System.out.println("");
		System.out.println("Order Total: $" + df.format(getTotal(totalNumberOfBooks, bookSubtotal)));
			
			
		in.close();
			
			
	}
		/**
		 * computes the total amount including shipping and taxes
		 * @param numberOfBooks amount of books purchased
		 * @param bookSubtotal subtotal without shipping and taxes
		 * @return the total including shipping and taxes
		 */
		
		
		
	public static double getTotal(int totalNumberOfBooks, double bookSubtotal) {
		final double PERCENT_TAX = 0.055;
		double taxAmount = (bookSubtotal * PERCENT_TAX);
		final double SHIPPING_CHARGE = 1.5;
		double shippingAmount = SHIPPING_CHARGE * totalNumberOfBooks;
		double orderTotal = bookSubtotal + taxAmount + shippingAmount;
		return orderTotal;
	}
}

