package com.udacity.vehicles.client.maps;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Declares a class to store an address, city, state and zip code.
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String address;
    private String city;
    private String state;
    private String zip;

}
