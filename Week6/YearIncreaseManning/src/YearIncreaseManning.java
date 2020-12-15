
public class YearIncreaseManning {
	public static void main (String [] args) {
		int currentYear = 0;
		final int START_YEAR = 2015;
		final int FACTOR = 5;
		final int TOTAL_YEARS_FROM_START = 30;
		
		
		final int END_YEAR = START_YEAR + TOTAL_YEARS_FROM_START;
		currentYear = START_YEAR;

		while (currentYear <= END_YEAR){
		System.out.println(currentYear);
		currentYear+=FACTOR;
		}
	}
}

