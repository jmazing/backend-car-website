package com.udacity.boogle.maps;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockAddressRepositoryTests {

	private MockAddressRepository mockAddressRepository;

	@BeforeEach
	public void setUp() {
		mockAddressRepository = new MockAddressRepository();
	}

	@Test
	public void testGetPriceHappy() {
		Address address = mockAddressRepository.getRandomAddress();
		String concatednatedAddress = String.format("%s, %s %s %s", address.getAddress(), address.getCity(), address.getState(), address.getZip());
		List addressList = Arrays.asList(mockAddressRepository.getADDRESSES());
		assertTrue(addressList.contains(concatednatedAddress));
	}
}
