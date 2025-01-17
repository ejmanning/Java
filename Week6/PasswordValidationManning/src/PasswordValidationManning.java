import java.util.Scanner;
public class PasswordValidationManning {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a password: ");
		String password = in.nextLine();
		
		System.out.println("Please confirm your password: ");
		String confirmedPassword = in.nextLine();
		
		if(validatePassword(password, confirmedPassword)) {
			System.out.println("Password changed");
			
		in.close();
		
		}
	
	}
		
	public static boolean validatePassword(String password, String confirmedPassword) {
		boolean valid = true;
		
		while(!password.equals(confirmedPassword)) {
			valid = false;
			System.out.println("Confirmed password is not the same as password");
			return valid;
			
		}
		
		while(!(password.length() >= 8)) {
			valid = false;
			System.out.println("Password must be 8 or more characters");
			return valid;
		} 
		
		 char ch;
		    boolean capitalFlag = false;
		    boolean lowerCaseFlag = false;
		    boolean numberFlag = false;
		    for(int i=0;i < password.length();i++) {
		        ch = password.charAt(i);
		        if( Character.isDigit(ch)) {
		            numberFlag = true;
		        }
		        else if (Character.isUpperCase(ch)) {
		            capitalFlag = true;
		        } else if (Character.isLowerCase(ch)) {
		            lowerCaseFlag = true;
		        }
		    }
		        if (lowerCaseFlag == false) {
		        	System.out.println("Password needs at least one lowercase letter.");
		        }
		        
		        if (numberFlag == false) {
		        	System.out.println("Password needs at least one digit.");
		        }
		        
		        if (capitalFlag == false) {
		        	System.out.println("Password needs at least one uppercase letter.");
		        }
		        
		        if(numberFlag && capitalFlag && lowerCaseFlag)
		            valid = true;
		        else {
		        	valid = false;
		        }

		return valid;
		
	}

} 

