package logic;

//Erica Manning
//This class creates the budget object
public class Budget {
	private double monthlyIncome;
	private double housingExpenses;
	private double insuranceAndUtilities;
	private double restaurantsAndFood;
	private double automobileExpenses;
	
	public Budget() {
		
	}
	
	public Budget(double monthlyIncome, double housingExpenses, double insuranceAndUtilities, double restaurantsAndFood,
			double automobileExpenses) {
		this.monthlyIncome = monthlyIncome;
		this.housingExpenses = housingExpenses;
		this.insuranceAndUtilities = insuranceAndUtilities;
		this.restaurantsAndFood = restaurantsAndFood;
		this.automobileExpenses = automobileExpenses;
	}
	

	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getHousingExpenses() {
		return housingExpenses;
	}

	public void setHousingExpenses(double housingExpenses) {
		this.housingExpenses = housingExpenses;
	}

	public double getInsuranceAndUtilities() {
		return insuranceAndUtilities;
	}

	public void setInsuranceAndUtilities(double insuranceAndUtilities) {
		this.insuranceAndUtilities = insuranceAndUtilities;
	}

	public double getRestaurantsAndFood() {
		return restaurantsAndFood;
	}

	public void setRestaurantsAndFood(double restaurantsAndFood) {
		this.restaurantsAndFood = restaurantsAndFood;
	}

	public double getAutomobileExpenses() {
		return automobileExpenses;
	}

	public void setAutomobileExpenses(double automobileExpenses) {
		this.automobileExpenses = automobileExpenses;
	}
	
	/**
	 * Adds up the total of expenses and divides it by the monthly income to find the percent of the total
	 * @return the percent the total is taking from the monthly income
	 */
	public double percentOfIncome(Budget b) {
		double total=0;
		total = b.housingExpenses + b.insuranceAndUtilities + b.restaurantsAndFood + b.automobileExpenses;
		double percent = (total / b.monthlyIncome);
		return percent;
	}
	
	/**
	 * Adds up the total of expenses and subtracts it from the monthly income to see how much is left
	 * @return the amount of dollars left
	 */
	public double dollarsLeft(Budget b) {
		double total=0;
		total = b.housingExpenses + b.insuranceAndUtilities + b.restaurantsAndFood + b.automobileExpenses;
		double dollarsLeft = b.monthlyIncome - total;
		return dollarsLeft;
	}
	
	
	
}
