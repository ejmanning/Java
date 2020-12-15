import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MidtermManningTest extends MidtermManning {

	@Test
	void test() {
		assertEquals(27.14, MidtermManning.bonusCalculator("n", 1356.77), 0.01);
		assertEquals(437.07, MidtermManning.bonusCalculator("y", 14568.98), 0.01);
		assertEquals(197.53, MidtermManning.bonusCalculator("n", 9876.55), 0.01);
		
	}

}
