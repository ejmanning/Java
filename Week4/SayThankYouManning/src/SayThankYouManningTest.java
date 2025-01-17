import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SayThankYouManningTest extends SayThankYouManning {

	@Test
	void testSayThanksString() {
		assertEquals("Thanks Bruce", SayThankYouManning.sayThanks("Bruce"));
	}

	@Test
	void testSayThanksStringString() {
		assertEquals("Thank you Bruce Springsteen", SayThankYouManning.sayThanks("Bruce", "Springsteen"));
	}

	@Test
	void testSayThanksStringStringString() {
		assertEquals("Thank you so very much Mr. Bruce Springsteen", SayThankYouManning.sayThanks("Mr.", "Bruce", "Springsteen"));
	}

}
