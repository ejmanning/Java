
public class SayThankYouManning {
	public static void main(String [] args) {
		System.out.println(sayThanks("Bruce")); //will print "Thanks Bruce"
		System.out.println(sayThanks("Bruce", "Springsteen")); //will print "Thank you, Bruce Springsteen"
		System.out.println(sayThanks("Mr.", "Bruce", "Springsteen")); //will print "Thank you so very much, Mr. Bruce Springsteen"


	}
	
	/**
	 * Says thanks
	 * @param firstName is the first name
	 * @return thank you message
	 */
	public static String sayThanks(String firstName) {
		return "Thanks " + firstName;
	}
	
	/**
	 * says thank you
	 * @param firstName is the first name
	 * @param lastName is the last name
	 * @return thank you message
	 */
	
	public static String sayThanks(String firstName, String lastName) {
		return "Thank you " + firstName + " " + lastName;
	}
	
	/**
	 * says thank you so very much
	 * @param title is the title
	 * @param firstName is the first name
	 * @param lastName is the last name
	 * @return thank you message
	 */
	public static String sayThanks(String title, String firstName, String lastName) {
		return "Thank you so very much " + title + " " + firstName + " " + lastName;
	}
}
