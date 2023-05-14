package com.udacity.vehicles.client.maps;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Implements a class to interface with the Maps Client for location data.
 */
@FeignClient("boogle-maps-service")
public interface MapsClient {
    
    @GetMapping("/maps")
    public Address getAddress(@RequestParam Double lat, @RequestParam Double lon);
}
