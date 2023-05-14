package com.udacity.boogle.maps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/maps")
@RequiredArgsConstructor
public class MapsController {

    @Autowired
    private final MockAddressRepository mockAddressRepository;

    @GetMapping
    public Address get(@RequestParam Double lat, @RequestParam Double lon) {
        return mockAddressRepository.getRandomAddress();
    }
}
