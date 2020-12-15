import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidationManningTest extends PasswordValidationManning {

	@Test
	void testValidatePassword() {
		//good password
		assertTrue(PasswordValidationManning.validatePassword("1Turtle2", "1Turtle2"));
		
		//doesn't match
		assertFalse(PasswordValidationManning.validatePassword("1Penguin", "2Penguin"));
		
		//match but too short
		assertFalse(PasswordValidationManning.validatePassword("CATs123", "CATs123"));
		
		//match but no lowercase
		assertFalse(PasswordValidationManning.validatePassword("DOGS1234", "DOGS1234"));
		
		//match but no uppercase
		assertFalse(PasswordValidationManning.validatePassword("pigs1234", "pigs1234"));
		
		//match but no digits
		assertFalse(PasswordValidationManning.validatePassword("HAMSTEr", "HAMSTEr"));
		
		//first password is too short
		assertFalse(PasswordValidationManning.validatePassword("Frog123", "Frog1234"));
		
		//extra long good password
		assertTrue(PasswordValidationManning.validatePassword("123ClownFish456", "123ClownFish456"));
		
		
	}

}