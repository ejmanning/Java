package graphics;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logic.Budget;

//Erica Manning
//This class adds all of the components to the panel and tells the buttons what to do when clicked
public class BudgetPanel extends JPanel {
	
		BudgetDrawing bar = new BudgetDrawing();
	
		final int FIELD_WIDTH = 10;
		
		JLabel monthlyIncomeLabel = new JLabel("Monthly Income: ");
		JTextField monthlyIncomeText = new JTextField(FIELD_WIDTH);
		
		JLabel housingExpensesLabel = new JLabel("Housing Expenses: ");
		JTextField housingExpensesText = new JTextField(FIELD_WIDTH);
		
		JLabel insuranceAndUtilitiesLabel = new JLabel("Insurance and Utilities: ");
		JTextField insuranceAndUtilitiesText = new JTextField(FIELD_WIDTH);
		
		JLabel restaurantsAndFoodLabel = new JLabel("Restaurants and Food: ");
		JTextField restaurantsAndFoodText = new JTextField(FIELD_WIDTH);
		
		JLabel automobileExpensesLabel = new JLabel("Automobile Expenses: ");
		JTextField automobileExpensesText = new JTextField(FIELD_WIDTH);

		JLabel generalLabel = new JLabel("Enter data to see amount remaining in budget.");	
		
		JButton reset = new JButton("Clear");
		JButton submit = new JButton("Submit");

		resetListener r = new resetListener();
		submitListener s = new submitListener();
		
		public BudgetPanel() {
			
			reset.addActionListener(r);
			submit.addActionListener(s);
			
			bar.setPreferredSize(new Dimension(260, 90));
			
			add(monthlyIncomeLabel);
			add(monthlyIncomeText);
			add(housingExpensesLabel);
			add(housingExpensesText);
			add(insuranceAndUtilitiesLabel);
			add(insuranceAndUtilitiesText);
			add(restaurantsAndFoodLabel);
			add(restaurantsAndFoodText);
			add(automobileExpensesLabel);
			add(automobileExpensesText);
			add(reset);
			add(submit);
			add(bar);
			add(generalLabel);
		}
	
	class resetListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			monthlyIncomeText.setText("");
			housingExpensesText.setText(""); 
			insuranceAndUtilitiesText.setText("");
			restaurantsAndFoodText.setText("");
			automobileExpensesText.setText("");
			generalLabel.setText("Enter data to see amount remaining in budget.");
			bar.clear();
		}
	}
	
	class submitListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String mi = monthlyIncomeText.getText();
			String he = housingExpensesText.getText();
			String iu = insuranceAndUtilitiesText.getText();
			String rf = restaurantsAndFoodText.getText();
			String ae = automobileExpensesText.getText();
			
			Budget b = new Budget();
			
			Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
			
			if(mi.equals("") || he.equals("") || iu.equals("") || rf.equals("") || ae.equals("")) {
				generalLabel.setText("Data entry error. Try again.");
			}
			
			else if(!pattern.matcher(mi).matches() && !pattern.matcher(he).matches() && !pattern.matcher(iu).matches() && !pattern.matcher(rf).matches() && !pattern.matcher(ae).matches()) {
				generalLabel.setText("Data entry error. Try again.");
			}
			else {
			
				try {
					double monthlyIncomeAmount = Double.parseDouble(mi);
					b.setMonthlyIncome(monthlyIncomeAmount);
					
					double housingExpensesAmount = Double.parseDouble(he);
					b.setHousingExpenses(housingExpensesAmount);
					
					double insuranceAndUtilitiesAmount = Double.parseDouble(iu);
					b.setInsuranceAndUtilities(insuranceAndUtilitiesAmount);
					
					double restaurantsAndFoodAmount = Double.parseDouble(rf);
					b.setRestaurantsAndFood(restaurantsAndFoodAmount);
					
					double automobileExpensesAmount = Double.parseDouble(ae);
					b.setAutomobileExpenses(automobileExpensesAmount);
				}
				
				catch (NumberFormatException exception) {
					generalLabel.setText("Data entry error. Try again.");
				}
				
				b.dollarsLeft(b);
				
				if (b.dollarsLeft(b) >= 0) {
					DecimalFormat df = new DecimalFormat("###.00");
					generalLabel.setText("$" + df.format(b.dollarsLeft(b)) + " remaining in budget");
				}
				else if (b.dollarsLeft(b) < 0) {
					generalLabel.setText("OVER BUDGET");
				}
				
				double percent = b.percentOfIncome(b);
				bar.adjustFill(percent);
			}
		}
		
	}
}
