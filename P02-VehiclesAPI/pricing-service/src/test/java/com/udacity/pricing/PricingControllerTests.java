package com.udacity.pricing;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PriceException;
import com.udacity.pricing.service.PricingService;

@ExtendWith(MockitoExtension.class)
public class PricingControllerTests {
    
    @Mock
    private PricingService pricingService;

    @InjectMocks
    private PricingController pricingController;

    Price price;

    @BeforeEach
    public void setUp() {
        this.price = new Price("USD", new BigDecimal(22000), 1L);
    }

    @Test
    public void testPricingControllerHappy() throws PriceException {
        when(pricingService.getPrice(1L)).thenReturn(price);
        Price result = pricingController.get(1L);
        assertTrue(price.equals(result));
    }

    @Test
	public void testPriceException() throws PriceException {
        when(pricingService.getPrice(-1L)).thenThrow(new PriceException("Unable to get price for vehicled id -1"));
        assertThrows(ResponseStatusException.class, () -> {
			pricingController.get(-1L);
		});
	}
}
