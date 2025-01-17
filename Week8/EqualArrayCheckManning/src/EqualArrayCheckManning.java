
public class EqualArrayCheckManning {
	//Erica Manning
	public static void main(String [] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};
		int[] array3 = {2, 4, 6, 8, 10, 12};
		int[] array4 = {2, 3, 4, 5, 1};
		
		if(areArraysEqual(array1, array2) == true) {
			System.out.println("Arrays 1 and 2 are equal.");
		}
		else {
			System.out.println("Arrays 1 and 2 are not equal.");
		}
		
		if(areArraysEqual(array1, array3) == true) {
			System.out.println("Arrays 1 and 3 are equal.");
		}
		else {
			System.out.println("Arrays 1 and 3 are not equal.");
		}
		
		if(areArraysEqual(array1, array4) == true) {
			System.out.println("Arrays 1 and 4 are equal.");
		}
		else {
			System.out.println("Arrays 1 and 4 are not equal.");
		}
		
	}
	/**
	 * 
	 * @param array1 first array compared
	 * @param array other array compared
	 * @return if they are equal
	 */
	
	public static boolean areArraysEqual(int [] array1, int [] array) {
		boolean equal = true;
		
		if (array1.length != array.length) {
			equal = false;
			return equal;
		}
		
		for (int i = 0; i<array1.length; i++) {
			if (array1[i]!=array[i]) {
				equal = false;
			}
		}
		
		return equal;
	}
}
