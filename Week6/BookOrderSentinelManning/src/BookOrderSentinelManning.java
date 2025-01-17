import java.text.DecimalFormat;
import java.util.Scanner;

public class BookOrderSentinelManning {
	//Erica Manning
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat(".00");
		
		double bookSubtotal = 0;
			
		System.out.print("Enter the book price and press enter or type 999 when you are finished adding books: ");
		double tempBookSubtotal = in.nextDouble();
		
		int totalNumberOfBooks = 0;
		
		while(!(tempBookSubtotal == 999)) {
			bookSubtotal += tempBookSubtotal;
			totalNumberOfBooks++;
			
			in.nextLine();
			
			System.out.print("Enter the book price and press enter or type 999 when you are finished adding books: ");
			tempBookSubtotal = in.nextDouble();
		}
		
		System.out.println("");
		System.out.println("Number of books purchased: " + totalNumberOfBooks);
		System.out.println("Book subtotal: $" + df.format(bookSubtotal));
		
		getTotal(totalNumberOfBooks, bookSubtotal);
			
			
		in.close();
			
			
	}
		/** 
		 * This method gets the tax amount, shipping amount, and order total
		 * @param totalNumberOfBooks is the total number of books purchased
		 * @param bookSubtotal is the amount spent on books before shipping and taxes
		 */
		
		
		
	public static void getTotal(int totalNumberOfBooks, double bookSubtotal) {
		DecimalFormat df = new DecimalFormat(".00");
		final double PERCENT_TAX = 0.055;
		double taxAmount = (bookSubtotal * PERCENT_TAX);
		final double SHIPPING_CHARGE = 1.5;
		double shippingAmount = SHIPPING_CHARGE * totalNumberOfBooks;
		double orderTotal = bookSubtotal + taxAmount + shippingAmount;
		System.out.println("Tax: $" + df.format(taxAmount));
		System.out.println("Shipping: $" + df.format(shippingAmount));
		System.out.println("----------------");
		System.out.println("Order Total: $" + df.format(orderTotal));
		
		
	}
}

