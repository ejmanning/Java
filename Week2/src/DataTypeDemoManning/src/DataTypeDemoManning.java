
public class DataTypeDemoManning {
	//Erica Manning
		public static void main(String[] args) {
			
		short age=19; 
		float sisterAge=20; 
		final double AGE_DIFFERENCE=2.5; 
		final boolean ANSWER=true;
		final int PET_FISH=5;
		long schoolYears=10000;
		byte greatGrandParentsAge=127;
		char hope='A';
		double semestersInSchool = 3.5;
		boolean hopeNotFalse = false;
		int semestersTotal = 5;
		
		System.out.println("My name is Erica Manning and I am " + age + " years old.");	//19 is short
		System.out.println("I have a sister who is " + sisterAge + " years old.");	//20 is constant float
		System.out.println("She is " + AGE_DIFFERENCE + " years older than me.");	//2.5 is constant double
		System.out.println("It is " + ANSWER + " that I am sometimes jealous of her age.");	//true is constant boolean
		System.out.println("But I know I will get there soon. It feels like I have been in school for " + schoolYears + " years."); //1000 is long
		System.out.println("But I have actually only had almost " + semestersInSchool + " semesters out of my " + semestersTotal + " semesters total. Hopefully this year goes by quickly.");	//3.5 is double and 5 is int
		System.out.println("My sister and I have had " + PET_FISH + " goldfish together and we do not plan on getting anymore.");	//5 is constant int
		System.out.println("Today I discovered that if my great grandma was still alive, she would be " + greatGrandParentsAge + " years old."); //127 is byte
		System.out.println("I surely hope I get an " + hope + " on this assignment! :)");	//A is char
		System.out.println("I hope the above statement isn't " + hopeNotFalse + ".");		//false is boolean
		}
	}
