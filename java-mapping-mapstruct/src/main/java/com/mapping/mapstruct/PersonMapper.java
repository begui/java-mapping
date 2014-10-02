package com.mapping.mapstruct;

import java.math.BigInteger;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;
import com.mapping.bean.Person;
import com.mapping.bean.PersonDto;

@Mapper(uses=AddressMapper.class)
public interface PersonMapper {

	@Mappings({
		@Mapping(source="firstName", target="name"),
		@Mapping(source="lastName",target="name"),
		@Mapping(source="age", target="age"),
		@Mapping(source="addresses", target="addresses"),
		@Mapping(source="phoneNumbers", target="phoneNumbers")
		
	})
	PersonDto personToPersonDto(Person person); 
	List<AddressDto> addressToAddressDto(List<Address> address);
	List<String> phoneToPhoneDto(List<BigInteger> phoneNumbers);
}
