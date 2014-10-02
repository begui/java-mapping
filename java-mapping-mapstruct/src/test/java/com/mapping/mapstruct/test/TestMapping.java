package com.mapping.mapstruct.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;
import com.mapping.bean.Person;
import com.mapping.bean.PersonDto;
import com.mapping.mapstruct.AddressMapperImpl;
import com.mapping.mapstruct.PersonMapperImpl;

public class TestMapping {
	@Test
	public void testAddressToAddressDTO() {
		Address source = new Address();
		source.setBlock("1000");
		source.setStreet("Some Street");
		source.setCity("Some City");
		source.setState("ST");
		source.setZip("55555");
		source.setPrimary("Y");

		AddressDto target = new AddressMapperImpl().addressToAddressDto(source);
		
		assertNotNull(target);
		assertEquals(target.getBlock(), source.getBlock());
		assertEquals(target.getStreet(), source.getStreet());
		assertEquals(target.getCity(), source.getCity());
		assertEquals(target.getState(), source.getState());
		assertEquals(target.getZip(), new Integer(55555));
		assertEquals(target.getStreetLine(), "1000 Some Street");
		assertEquals(target.isPrimary(), true);

	}

	@Test
	public void testAddressDtoToAddress() {
		AddressDto source = new AddressDto();
		source.setStreetLine("1000 Some Street");
		source.setBlock("1000");
		source.setStreet("Some Street");
		source.setCity("Some City");
		source.setState("ST");
		source.setZip(55555);
		source.setPrimary(true);

		Address target = new AddressMapperImpl().addressDtoToAddress(source);

		assertNotNull(target);
		assertEquals(target.getBlock(), source.getBlock());
		assertEquals(target.getStreet(), source.getStreet());
		assertEquals(target.getCity(), source.getCity());
		assertEquals(target.getState(), source.getState());
		assertEquals(target.getZip(), "55555");
		assertEquals(target.getPrimary(), "Y");
	}

	@Test
	public void testPersonToPersonDto() {
		Person source = new Person();
		source.setAge(new Integer(32));
		source.setFirstName("Gunnar");
		source.setLastName("Morling");
		List<BigInteger> phoneNumbers = Arrays.asList(new BigInteger("5555555555"), new BigInteger("6666666666"));
		source.setPhoneNumbers(phoneNumbers);

		List<Address> addresses = new ArrayList<Address>();
		Integer blockId = 1000;
		for (int i = 0; i < 10; i++) {
			Address asource = new Address();
			asource.setBlock(blockId.toString());
			asource.setStreet("Some Street");
			asource.setCity("Some City");
			asource.setState("ST");
			asource.setZip("55555");
			addresses.add(asource);
			blockId++;
		}
		source.setAddresses(addresses);

		PersonDto target = new PersonMapperImpl().personToPersonDto(source);
		assertNotNull(target);
		assertEquals(target.getAge(), 32);
		assertEquals(target.getPhoneNumbers().size(), 2);

		// TODO: validate phone data
		assertEquals(target.getAddresses().size(), 10);
		List<AddressDto> addressDto = target.getAddresses();
		blockId = 1000;
		for (AddressDto adto : addressDto) {
			assertEquals(adto.getBlock(), blockId.toString());
			assertEquals(adto.getStreet(), "Some Street");
			assertEquals(adto.getCity(), "Some City");
			assertEquals(adto.getState(), "ST");
			assertEquals(adto.getZip(), new Integer("55555"));
			assertEquals(adto.getStreetLine(), blockId.toString() + " Some Street");
			blockId++;
		}
	}

	@Test
	public void testAddressDtoUpdate() {
		Address source = new Address();
		source.setBlock("1000");
		source.setStreet("Some Street");
		source.setCity("Some City");
		source.setState("ST");
		source.setZip("55555");
		
		AddressDto target = new AddressMapperImpl().addressToAddressDto(source); 
		target.setBlock("1002");

		source = new AddressMapperImpl().updateAddressFromAddressDto(target, source);
		assertNotNull(source);
		assertEquals(source.getBlock(), "1002");
	}

}
