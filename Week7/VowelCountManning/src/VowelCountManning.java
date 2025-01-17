import java.util.Scanner;
public class VowelCountManning {
	//Erica Manning
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		String word = in.nextLine();
		
		if(vowelCount(word) > 0) {
			System.out.println(vowelCount(word) + " vowel(s) in " + word);
		}
		
		in.close();
	}
	
	/**
	 * this method counts the number of vowels in the string entered by the user
	 * @param word is the string entered by the user
	 * @return vowelCount is the number of vowels found
	 */
	public static int vowelCount(String word) {
		int vowelCount = 0;
		for(int i=0; i < word.length(); i++) {
			String sub = word.substring(i, i+1);
			
			if (sub.equalsIgnoreCase("a") || sub.equalsIgnoreCase("e") || sub.equalsIgnoreCase("i") || sub.equalsIgnoreCase("o") || sub.equalsIgnoreCase("u")) {
				vowelCount++;
			}
			
			if (vowelCount==0) {
				if (sub.equalsIgnoreCase("y")) {
					vowelCount++;
				}
			}
					
		}
		
		
		if (vowelCount==0) {
			System.out.println("You must have made a spelling mistake somewhere.");
			
		}
		
		return vowelCount;
	}
}
