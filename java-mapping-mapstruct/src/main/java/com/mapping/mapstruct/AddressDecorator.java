package com.mapping.mapstruct;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;

public abstract class AddressDecorator implements AddressMapper {

	public AddressMapper delegate;

	public AddressDecorator(AddressMapper delegate) {
		this.delegate = delegate;
	}

	@Override
	public AddressDto addressToAddressDto(Address address) {
		AddressDto dto = delegate.addressToAddressDto(address);
		if (address.getPrimary() != null) {
			if (address.getPrimary().equalsIgnoreCase("Y")
					|| address.getPrimary().equalsIgnoreCase("Yes")) {
				dto.setPrimary(true);
			}
		}
		return dto;
	}

	@Override
	public Address addressDtoToAddress(AddressDto address) {
		Address ndto = delegate.addressDtoToAddress(address);
		if (address.isPrimary()) {
			ndto.setPrimary("Y");
		}
		return ndto;
	}

}
