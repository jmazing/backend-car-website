package com.udacity.vehicles.client.prices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Implements a class to interface with the Pricing Client for price data.
 */
@FeignClient("pricing-service")
public interface PriceClient {

    @GetMapping("/services/price")
    public Price getPrice(@RequestParam Long vehicleId);
}
