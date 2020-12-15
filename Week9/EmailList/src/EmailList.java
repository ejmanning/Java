import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
public class EmailList {
	public static void main(String [] args) throws IOException {
		String address = "https://bbmedia.dmacc.edu/CIS/CIS171/emaillist.txt";
		URL pageLocation = new URL(address);
		Scanner in = new Scanner(pageLocation.openStream());
		PrintWriter out = new PrintWriter("masterlist.txt");
				
		while(in.hasNextLine()){
			String person = in.nextLine();
			String newPerson = separateName(person);
			System.out.println(newPerson);
			out.println(newPerson);
		}
		
		in.close();
		out.close();
				
	}
	
	
	public static String separateName(String person) {
		String firstName = "";
		String lastName = "";
		int i = 0;
		char ch = person.charAt(i);
		while (!(ch == '-')) {
			firstName = firstName + ch;
			i++;
			ch = person.charAt(i);
		}

		// increase the spot by one to get off the dash character
		i++;
		ch = person.charAt(i);
		
		// go until I find the next "-"
		while (!(ch == '-')) {
			lastName = lastName + ch;
			i++;
			ch = person.charAt(i);
		}
	
		// increase i by one and I know the rest of it is the email
		i++;
		String email = person.substring(i);
	
		return firstName + " " + lastName + " - " + email;
	}
}
