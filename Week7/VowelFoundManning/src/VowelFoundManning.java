import java.util.Scanner;

public class VowelFoundManning {
	//Erica Manning
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		int x=1;
		while(x > 0) {
			System.out.println("Please enter a word: ");
			String word = in.nextLine();
			
			for(int i=0; i < word.length(); i++) {
				int vowelCount = 0;
				String sub = word.substring(i, i+1);
			
				if (sub.equalsIgnoreCase("a") || sub.equalsIgnoreCase("e") || sub.equalsIgnoreCase("i") || sub.equalsIgnoreCase("o") || sub.equalsIgnoreCase("u")) {
					vowelCount++;
				}
				
				if(vowelCount == 0) {
					if(sub.equalsIgnoreCase("y")) {
						vowelCount++;
					}
				}
				
				if (vowelCount>=1) {
					System.out.println("A vowel has been found");
					break;	
				}
				
			}
		}
		in.close();
	}
}