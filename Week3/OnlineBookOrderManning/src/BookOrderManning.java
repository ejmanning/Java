import java.text.DecimalFormat;
import java.util.Scanner;

public class BookOrderManning {
	//Erica Manning
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("This program will include tax and shipping to calculate the total price for books bought.");
		
		System.out.print("Enter the number of books purchased: ");
		int numberOfBooks = in.nextInt();
		
		System.out.print("Enter the subtotal: ");
		double bookSubtotal = in.nextDouble();
		
		final double PERCENT_TAX = 0.055;
		double taxAmount = (bookSubtotal * PERCENT_TAX);
		final double SHIPPING_CHARGE = 1.5;
		double shippingAmount = SHIPPING_CHARGE * numberOfBooks;
		double orderTotal = bookSubtotal + taxAmount + shippingAmount;
		
		System.out.println("Number of books: " + numberOfBooks);
		System.out.println("Book subtotal: $" + bookSubtotal);
		System.out.println("Tax: $" + df.format(taxAmount));
		System.out.println("Shipping: $" + df.format(shippingAmount));
		System.out.println(" ");
		System.out.println("Order Total: $" + df.format(orderTotal));
		
		
		
		
		
	}
}