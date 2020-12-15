import java.text.DecimalFormat;

public class PhotoBillingManning {
	//Erica Manning
	public static void main(String [] args) {
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println(df.format(computePhotoBill(19.99)));   // 21.19

		System.out.println(df.format(computePhotoBill(19.99, 2)));   // 42.38

		System.out.println(df.format(computePhotoBill (19.99, 2, .1)));   // 38.14

	}
	
	/**
	 * Adds tax to price of one item
	 * @param price price before tax
	 * @return price with tax
	 */
	public static double computePhotoBill(double price) {
		 final double TAX = 0.06;
		 double addToPrice = price * TAX;
		 return price + addToPrice;
	}
	
	/**
	 * Adds tax to price of more than one of the same items
	 * @param price original price of one
	 * @param quantity how many bought
	 * @return price of quantity with tax
	 */
	
	public static double computePhotoBill(double price, int quantity) {
		final double TAX = 0.06;
		double together = price * quantity;
		double addToPrice = together * TAX;
		return together + addToPrice;
		
	}
	
	/**
	 * Adds tax and coupon to more than one of the same items 
	 * @param price original price of one
	 * @param quantity how many bought
	 * @param coupon percent of coupon code to reduce from price
	 * @return price of quantity with coupon and tax
	 */
	
	public static double computePhotoBill(double price, int quantity, double coupon) {
		final double TAX = 0.06;
		double newSubtotal = price * quantity;
		double subtractFromPrice = newSubtotal * coupon;
		double minusCouponTotal = newSubtotal - subtractFromPrice;
		double allTogether = minusCouponTotal * TAX;
		return allTogether + minusCouponTotal; 
		
	}
	
	
}
