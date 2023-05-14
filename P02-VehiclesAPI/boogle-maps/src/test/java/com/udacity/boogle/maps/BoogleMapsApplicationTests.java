package com.udacity.boogle.maps;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BoogleMapsApplicationTests {

	private MockAddressRepository mockAddressRepository;

	@BeforeEach
	public void setUp() {
		mockAddressRepository = new MockAddressRepository();
		
	}

}
