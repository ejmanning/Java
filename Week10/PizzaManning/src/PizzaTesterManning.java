
public class PizzaTesterManning implements PizzaConstants{

	public static void main(String[] args) {
		
		System.out.println("Welcome to " + COMPANY);
		System.out.println(PizzaConstants.getSpecial());
		
		Pizza myPizza = new Pizza("mushroom", "large", 9.99);
		
		Pizza yourPizza = new Pizza("pepperoni", "extra large", 13.99);
		
		yourPizza.setDescription("a flat bread with meat and cheese. ");
		
		//Pizza thirdPizza = new Pizza("pepperoni", "extra small", 7.99);
		
		
		System.out.println(myPizza.repeatOrder());
		System.out.println(yourPizza.repeatOrder());
		//System.out.println(thirdPizza.repeatOrder());
		
		Order kelli = new Order();

		kelli.addToOrder(myPizza);

		kelli.addToOrder(yourPizza);

		System.out.println(kelli.getTotalPrice());
	}

}
