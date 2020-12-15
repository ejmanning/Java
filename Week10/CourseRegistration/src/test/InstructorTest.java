package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Instructor;

class InstructorTest {

	@Test
	void testMakeEmailAddress() {
		Instructor test = new Instructor();
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("kit", "cat"));
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("KIT", "CAT"));
	}

}
