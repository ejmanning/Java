import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortBabyNamesManning {
	//Erica Manning
	public static void main(String [] args) throws IOException{
		
		try {
			String address = "https://bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
			URL pageLocation = new URL(address);
			Scanner in = new Scanner(pageLocation.openStream());
			
			PrintWriter boys = new PrintWriter("boys.txt");
			PrintWriter girls = new PrintWriter("girls.txt");
			
			String value = "";
			
			while (in.hasNextLine()) {
				value = in.nextLine();
				
				if (value.contains("boy")) {
					boys.println(removeGender(value));
				}
				else if (value.contains("girl")) {
					girls.println(removeGender(value));
				}
			}
			
			in.close();
			boys.close();
			girls.close();
		}
		
		
		
		catch (IOException exception) {
			System.out.println("File not found");
		}
	}
	
	public static String removeGender(String value) {
		
		String girl = "girl";
		String boy = "boy";
		if (value.contains(girl)) {
			String tempWord = girl + " ";
			value = value.replaceAll(tempWord, "");
		}
		
		if (value.contains(boy)) {
			String tempWord = boy + " ";
			value = value.replaceAll(tempWord, "");
		}
		return value;
	}
}
