import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OnlineBookOrderWithMethodManningTest extends OnlineBookOrderWithMethodManning {

	@Test
	void testGetTotal() {
		assertEquals(79.71, OnlineBookOrderWithMethodManning.getTotal(5, 68.45), 0.01);
	}
	
	@Test
	void testGetTotal2() {
		assertEquals(144.27, OnlineBookOrderWithMethodManning.getTotal(8, 125.37), 0.01);
	}


}
