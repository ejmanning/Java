import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShopperRewardsManningTest extends ShopperRewardsManning {
	//Erica Manning
	@Test
	void testDiscountCoupon() {
		assertEquals(0, ShopperRewardsManning.discountCoupon(9.00),0.01 );
		assertEquals(0.04, ShopperRewardsManning.discountCoupon(10.00),0.01 );
		assertEquals(0.04, ShopperRewardsManning.discountCoupon(70.00),0.01 );
		assertEquals(0.07, ShopperRewardsManning.discountCoupon(71.00),0.01 );
		assertEquals(0.07, ShopperRewardsManning.discountCoupon(150.00),0.01 );
		assertEquals(0.10, ShopperRewardsManning.discountCoupon(151.00),0.01 );
		assertEquals(0.10, ShopperRewardsManning.discountCoupon(250.00),0.01 );
		assertEquals(0.15, ShopperRewardsManning.discountCoupon(251.00),0.01 );
	}

	@Test
	void testDiscountGas() {
		assertEquals(0.01, ShopperRewardsManning.discountGas(1), 0.01);
		assertEquals(0.01, ShopperRewardsManning.discountGas(49), 0.01);
		assertEquals(0.02, ShopperRewardsManning.discountGas(49.01), 0.01);
		assertEquals(0.02, ShopperRewardsManning.discountGas(100), 0.01);
		assertEquals(0.03, ShopperRewardsManning.discountGas(101), 0.01);
		assertEquals(0.00, ShopperRewardsManning.discountGas(0.99), 0.01);
	}

}
