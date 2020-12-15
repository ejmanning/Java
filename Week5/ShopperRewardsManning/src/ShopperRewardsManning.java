import java.text.DecimalFormat;
import java.util.Scanner;
public class ShopperRewardsManning {
	//Erica Manning
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Enter the cost of your groceries: ");
		
		double groceryCost = in.nextDouble();
		
		discountCoupon(groceryCost);
		
		System.out.println(discountCoupon(groceryCost));
		
		final int PERCENT_CONVERT_NUMBER = 100;
		double couponDollars = discountCoupon(groceryCost) * groceryCost;
		double displayCouponPercent = discountCoupon(groceryCost) * PERCENT_CONVERT_NUMBER;
		
		System.out.println("You received a coupon of $" + df.format(couponDollars) + ". (" + Math.round(displayCouponPercent) + "% of your purchase)");
		
		System.out.println("You have earned a $" + df.format(discountGas(groceryCost)) + " discount per gallon of gas.");
	
		in.close();
	}
	
	/**
	 * calculates the coupon percent off
	 * @param groceryCost - cost of groceries to show the correct coupon amount
	 */
	public static double discountCoupon(double groceryCost) {
		final int LOW_GROCERY_PURCHASE_RANGE = 10;
		final int MIDDLE_LOW_GROCERY_PURCHASE_RANGE = 70;
		final int MIDDLE_HIGH_GROCERY_PURCHASE_RANGE = 150;
		final int HIGH_GROCERY_PURCHASE_RANGE = 250;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double couponPercent = 0;
		
		if (groceryCost < LOW_GROCERY_PURCHASE_RANGE) {
			couponPercent=0;

		}
		else if (groceryCost <= MIDDLE_LOW_GROCERY_PURCHASE_RANGE) {
			couponPercent=0.04;
		}
		else if (groceryCost <= MIDDLE_HIGH_GROCERY_PURCHASE_RANGE) {
			couponPercent=0.07;
		}
		else if (groceryCost <= HIGH_GROCERY_PURCHASE_RANGE) {
			couponPercent=0.10;
		}
		else if (groceryCost > HIGH_GROCERY_PURCHASE_RANGE) {
			couponPercent=0.15;
		}
		
		return couponPercent;
	}
	
	/**
	 * calculates gas discount
	 * @param groceryCost - tells amount of discount to give
	 * @return gas discount amount
	 */
	public static double discountGas(double groceryCost) {
		
		double gasDiscount;
		final double START_RANGE_1 =1;
		final double END_RANGE_1 =49;
		final double START_RANGE_2 =49.01;
		final double END_RANGE_2 =100;
		final double START_RANGE_3 =100.01;
		if (groceryCost >= START_RANGE_1 && groceryCost <=END_RANGE_1) {
			gasDiscount=0.01;
		}
		else if (groceryCost >=START_RANGE_2 && groceryCost <=END_RANGE_2) {
			gasDiscount=0.02;
		}
		else if(groceryCost>=START_RANGE_3) {
			gasDiscount=0.03;
		}
		else {
			gasDiscount=0;
		}
		
		return gasDiscount;
	}
}
