
public class RandomTenManning {
	//Erica Manning
	public static void main(String[] args) {
		int numbers[] = new int[10];
		
		for(int i = 0; i < numbers.length; i++) {
		      numbers[i] = (int)(Math.random()*20 + 1);
		}
		
		System.out.print("All array items: ");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		 
		 System.out.print("Even Numbers: ");
		 for (int i = 0; i < numbers.length; i++) {
			 if (numbers[i]%2==0) {
				 System.out.print(numbers[i] + " ");
			 }
			
		 }
		 
		 System.out.println();
		 
		 System.out.print("Odd Numbers: ");
		 for (int i = 0; i < numbers.length; i++) {
			 if (numbers[i]%2!=0) {
				 System.out.print(numbers[i] + " ");
			 }
			
		 }
		 
		 System.out.println();
		 
		 System.out.print("Array in reverse order: ");  
	        //Loop through the array in reverse order  
	        for (int i = numbers.length-1; i >= 0; i--) {  
	            System.out.print(numbers[i] + " ");
	        }
	        
	     System.out.println();
	     
	     System.out.println("First array element: " + numbers[0]);
	     
	     int lastElement = numbers.length - 1;
	     
	     System.out.println("Last array element: " + numbers[lastElement]);
	     
	     int max = numbers[0];
	     for (int i = 1; i<numbers.length; i++) {
	    	 if (numbers[i]>max) {
	    		 max = numbers[i];
	    	 }
	     }
	     System.out.println("Highest array element: " + max);
	     
	     
	     int min = numbers[0];
	     for (int i = 1; i<numbers.length; i++) {
	    	 if (numbers[i]<min) {
	    		 min = numbers[i];
	    	 }
	     }
	     System.out.println("Lowest array element: " + min);
	     

		
	}
}
