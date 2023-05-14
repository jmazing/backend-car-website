package com.udacity.vehicles.domain;

import com.udacity.vehicles.client.maps.Address;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Stores information about a given location.
 * Latitude and longitude must be provided, while other
 * location information must be gathered each time from
 * the maps API.
 */
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    @NotNull
    private Double lat;

    @NotNull
    private Double lon;

    @Transient
    @Embedded
    private Address address;

    public Location(Double lat, Double lon) {
        this.lat = lat;
        this.lon = lon;
    }
}
