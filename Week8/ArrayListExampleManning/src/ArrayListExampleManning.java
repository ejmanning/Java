import java.util.ArrayList;
public class ArrayListExampleManning {
	//Erica Manning
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
	    System.out.println(names);
	    
	    names.add("Andy");
	    names.add("Angela");
	    names.add("Dwight");
	    names.add("Erin");
	    names.add("Jim");
	    names.add("Michael");
	    names.add("Pam");
	    names.add("Toby");
	  
	    System.out.print("Printed names: ");
	    for (int i = 0; i<names.size(); i++) {
	    	System.out.print(names.get(i) + " | ");
	    }
	    
	    System.out.println();
	    System.out.print("Name size: " + names.size());
	    
	    names.set(0, "Andy Bernard");
	    
	    System.out.println();
	    System.out.print("Printed names with Andy changed to Andy Bernard: ");
	    for (int i = 0; i<names.size(); i++) {
	    	System.out.print(names.get(i) + " | ");
	    }
	    
	    System.out.println();
	    
	    names.add(5, "Kelly");
	    
	    System.out.print("Printed names with Kelly after Jim: ");
	    for (int i = 0; i<names.size(); i++) {
	    	System.out.print(names.get(i) + " | ");
	    }
	    
	    System.out.println();
	    System.out.print("Printed names with enhanced for loop: ");
	    for (String i : names) {
	    	System.out.print(i + " | ");
	    }
	    
	    ArrayList<String> names2 = new ArrayList<String>(names);
	    
	    System.out.println();
	    System.out.print("Printed names2: ");
	    for (int i = 0; i<names2.size(); i++) {
	    	System.out.print(names2.get(i) + " | ");
	    }
	    
	    names.remove(0);
	    
	    System.out.println();
	    System.out.print("Printed names: ");
	    for (int i = 0; i<names.size(); i++) {
	    	System.out.print(names.get(i) + " | ");
	    }
	    
	    System.out.println();
	    System.out.print("Printed names2: ");
	    for (int i = 0; i<names2.size(); i++) {
	    	System.out.print(names2.get(i) + " | ");
	    }   
	    
	    
	}
	
	
	 
}
