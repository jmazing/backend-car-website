package com.udacity.boogle.maps;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MapsControllerTests {
    
    @Mock
    private MockAddressRepository mockAddressRepository;

    @InjectMocks
    private MapsController mapsController;


    Address address;

    @BeforeEach
    public void setUp() {
        this.address = new Address("123 lala lane" , "candy land", "North Gumdrop", "44489");
    }

    @Test
    public void testPricingControllerHappy(){
        when(mockAddressRepository.getRandomAddress()).thenReturn(this.address);
        Address result = mapsController.get(0.0, 0.0);
        assertTrue(this.address.equals(result));
    }

}
