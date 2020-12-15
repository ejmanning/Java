//Erica Manning
import java.util.ArrayList;

public class BlanketTesterManning {
	public static void main(String[]args) {
		//Blanket one = new Blanket("king", "blue", "cashmere");
		//System.out.println(one.getPrice());
		//System.out.println(one.featureReport());
		
		//one.setSize("twwin"); 
		//allows it to throw illegal argument exception and see error message
		
		Blanket one = new Blanket("king", "gold", "cashmere");
		Blanket two = new Blanket("twin", "black", "wool");
		ElectricBlanket three = new ElectricBlanket("king", "red", "cashmere", 5, true);
		ElectricBlanket four = new ElectricBlanket("queen", "multi-colored", "cotton", 1, false);
		
		//System.out.println(one.featureReport());
		//System.out.println(two.featureReport());
		//System.out.println(three.featureReport());
		//System.out.println(four.featureReport());
		
		ArrayList<Blanket> blankets = new ArrayList<Blanket>();
		
		blankets.add(one);
		blankets.add(two);
		blankets.add(three);
		blankets.add(four);
		
		
		System.out.println("-----Blankets under $100-----");
		for (Blanket b : blankets) {
			if(b.getPrice() < 100) {
				System.out.println(b.featureReport());
			}
		}
		
		//blankets.removeIf(Blanket.getPrice() > 100)
		
		
		
		
		
	}
}
