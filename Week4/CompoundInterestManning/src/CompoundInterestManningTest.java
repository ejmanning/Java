import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompoundInterestManningTest extends CompoundInterestManning {

	@Test
	void testComputeBalance() {
		assertEquals(1141.17, CompoundInterestManning.computeBalance(1000, 0.045, 3), 0.01);
		assertEquals(2318.55, CompoundInterestManning.computeBalance(2000, 0.03, 5), 0.01);
		assertEquals(3313.87, CompoundInterestManning.computeBalance(3000, 0.01, 10), 0.01);
	}

}
