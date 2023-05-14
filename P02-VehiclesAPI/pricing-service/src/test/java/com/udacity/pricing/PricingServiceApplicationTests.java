package com.udacity.pricing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;


public class PricingServiceApplicationTests {

	private PricingService pricingService;

	@BeforeEach
	public void setUp() {
		pricingService = new PricingService();
	}

	@Test
	public void testGetPriceHappy() throws PriceException {
		Price price = pricingService.getPrice(1L);
		assertEquals("USD", price.getCurrency());
		assertEquals(1, price.getVehicleId());
		assertTrue(new BigDecimal(5000).compareTo(price.getPrice()) == -1  && price.getPrice().compareTo(new BigDecimal(25000)) == -1);
	}

	@Test
	public void testPriceException() {
		assertThrows(PriceException.class, () -> {
			pricingService.getPrice(-1L);
		});

	}

}
