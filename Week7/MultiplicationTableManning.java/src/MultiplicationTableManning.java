
public class MultiplicationTableManning {
	//Erica Manning
	public static void main(String [] args) {
		int row = 12;
		int column = 12;
		
		for (int r = 1; r <=row; r++) {
			
			for (int c = 1; c <=column; c++) {
				System.out.printf("%4d", r*c);
			}
			
			System.out.println();
		}
	
	}
}	
