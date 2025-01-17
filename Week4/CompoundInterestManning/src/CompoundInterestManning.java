
public class CompoundInterestManning {
	public static void main(String [] args) {
		System.out.printf("Your total is $%.2f", computeBalance(5000, .05, 10));

		// should return $8144.47
		
		System.out.printf("\nYour total is $%.2f", computeBalance(2000, .03, 5));

		// should return $2318.55

		System.out.printf("\nYour total is $%.2f", computeBalance(3000, .01, 10));

		// should return $3313.87
	}
	
	/**
	 * does the math for compound interest (A = P(1+r)^t
	 * @param initialDeposit is the initial deposit or P
	 * @param interestRate is the annual interest rate or r
	 * @param years is the amount of years or t
	 * @return the future value of the investment/loan, including interest
	 */
	
	public static double computeBalance(double initialDeposit, double interestRate, int years) {
		double firstStepFutureValue = 1 + interestRate;
		double secondStepFutureValue = Math.pow(firstStepFutureValue, years);
		double futureValue = secondStepFutureValue * initialDeposit;
		
		return futureValue;
	}
}
