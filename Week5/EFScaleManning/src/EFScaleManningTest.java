import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EFScaleManningTest extends EFScaleManning {

	@Test
	void testReturnEFValue() {
		assertEquals(0,EFScaleManning.returnEFValue(65), 0.01);
		assertEquals(0,EFScaleManning.returnEFValue(85), 0.01);
		assertEquals(1,EFScaleManning.returnEFValue(86), 0.01);
		assertEquals(1,EFScaleManning.returnEFValue(110), 0.01);
		assertEquals(2,EFScaleManning.returnEFValue(111), 0.01);
		assertEquals(2,EFScaleManning.returnEFValue(135), 0.01);
		assertEquals(3,EFScaleManning.returnEFValue(136), 0.01);
		assertEquals(3,EFScaleManning.returnEFValue(165), 0.01);
		assertEquals(4,EFScaleManning.returnEFValue(166), 0.01);
		assertEquals(4,EFScaleManning.returnEFValue(200), 0.01);
		assertEquals(5,EFScaleManning.returnEFValue(201), 0.01);
		assertEquals(5,EFScaleManning.returnEFValue(300), 0.01);
		
		
	}

}
