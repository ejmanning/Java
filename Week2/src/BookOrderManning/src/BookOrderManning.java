
public class BookOrderManning {
	//Erica Manning
	public static void main(String[] args) {
		double bookSubtotal = 125.37;
		int numberOfBooks = 8;
		final double PERCENT_TAX = 0.055;
		double taxAmount = (bookSubtotal * PERCENT_TAX);
		final double SHIPPING_CHARGE = 1.5;
		double shippingAmount = SHIPPING_CHARGE * numberOfBooks;
		double orderTotal = bookSubtotal + taxAmount + shippingAmount;
		
		System.out.println("Number of books: " + numberOfBooks);
		System.out.println("Book subtotal: $" + bookSubtotal);
		System.out.println("Tax: $" + taxAmount);
		System.out.println("Shipping: $" + shippingAmount);
		System.out.println(" ");
		System.out.println("Order Total: $" + orderTotal);
		
		
		
	}
}
