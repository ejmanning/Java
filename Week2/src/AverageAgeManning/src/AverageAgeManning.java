
public class AverageAgeManning {
	public static void main(String[] args) {
		int cindyAge=61;
		int stanAge=62;
		int emilyAge=20;
		int ericaAge=19;
		final int NUMBER_OF_FAMILY_MEMBERS=4;
		double averageAge = (double) ((stanAge + cindyAge + emilyAge + ericaAge) / NUMBER_OF_FAMILY_MEMBERS );
		
		System.out.println("Stan's age is " + stanAge);
		System.out.println("Cindy's age is " + cindyAge);
		System.out.println("Emily's age is " + emilyAge);
		System.out.println("Erica's age is " + ericaAge);
		
		System.out.println("The average age of the family is " + averageAge);
	}
}
