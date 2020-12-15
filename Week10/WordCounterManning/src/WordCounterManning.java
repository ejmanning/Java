import java.util.Scanner;

public class WordCounterManning {
	//Erica Manning
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a phrase to receive a word count: ");
		String phrase = in.nextLine();
		System.out.println("There are " + countWords(phrase) + " words in the phrase.");
		
		in.close();
	}
	
	public static int countWords(String phrase) {
		int blankCount = 1;
		
		for (int i = 0; i<phrase.length(); i++) {
			String sub = phrase.substring(i, i+1);
			
			if(sub.equals(" ")) {
				blankCount++;
			}
		}
		return blankCount;
	}

}
