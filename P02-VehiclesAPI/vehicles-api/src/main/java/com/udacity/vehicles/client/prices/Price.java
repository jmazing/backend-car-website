package com.udacity.vehicles.client.prices;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Represents the price of a given vehicle, including currency.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    private String currency;
    private BigDecimal price;
    private Long vehicleId;
    
}
