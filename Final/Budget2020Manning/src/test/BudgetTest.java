package test;

//Erica Manning
//This class tests the methods in the Budget class
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.Budget;

class BudgetTest {
	Budget b = new Budget();
	Budget b1 = new Budget();

	@Test
	void testPercentOfIncome1() {
		b.setMonthlyIncome(4700);
		b.setHousingExpenses(800);
		b.setInsuranceAndUtilities(200);
		b.setAutomobileExpenses(360);
		b.setRestaurantsAndFood(400);
		
		double total = b.percentOfIncome(b);
		
		assertEquals(0.3745, total, 0.01);
	}
	
	@Test
	void testPercentOfIncome2() {
		b1.setMonthlyIncome(4000);
		b1.setHousingExpenses(1000);
		b1.setInsuranceAndUtilities(100);
		b1.setAutomobileExpenses(300);
		b1.setRestaurantsAndFood(600);
		
		double total1 = b1.percentOfIncome(b1);
		
		assertEquals(0.50, total1, 0.01);
	}
	
	@Test
	void testDollarsLeft1() {
		b.setMonthlyIncome(2000);
		b.setHousingExpenses(750);
		b.setInsuranceAndUtilities(50);
		b.setAutomobileExpenses(100);
		b.setRestaurantsAndFood(400);
		
		double total = b.dollarsLeft(b);
		
		assertEquals(700, total, 0.01);
	}
	
	@Test
	void testDollarsLeft2() {
		b1.setMonthlyIncome(4000);
		b1.setHousingExpenses(2000);
		b1.setInsuranceAndUtilities(500);
		b1.setAutomobileExpenses(1000);
		b1.setRestaurantsAndFood(600);
		
		double total1 = b1.dollarsLeft(b1);
		
		assertEquals(-100, total1, 0.01);
	}
	
	
	
}
