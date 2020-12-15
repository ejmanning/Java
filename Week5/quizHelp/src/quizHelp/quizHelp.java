package quizHelp;

public class quizHelp {
	public static void main(String[] args ) {
		String units = "feet";
		int inches = 0; 
		int measurement = 3; 

		switch ( units ) {
		  case "inches":
		      inches = measurement;
		      break;
		  case "feet":
		      inches = measurement * 12;
		      break;
		  case "yards":
		      inches = measurement * 36;
		      break;    
		  case "miles":
		      inches = measurement * 12 * 5280;
		      break;
		  default:       System.out.println("Illegal unit of measure.");

		} 

		System.out.println(inches);

	}
}
