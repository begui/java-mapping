package com.mapping.mapstruct;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;

@Mapper
@DecoratedWith(AddressDecorator.class)
public interface AddressMapper {

	@Mapping(target = "streetLine", expression = "java(address.getBlock() + \" \" + address.getStreet())")
	@Mapping(target = "isPrimary", ignore = true)
	public AddressDto addressToAddressDto(Address address);
	public Address addressDtoToAddress(AddressDto address);
	public AddressDto updateAddressDtoFromAddress(Address address, @MappingTarget AddressDto addressDto);
	public Address updateAddressFromAddressDto(AddressDto addressDto, @MappingTarget Address address);

}
