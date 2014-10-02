package com.mapping.mapstruct;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2014-10-02T00:13:13-0400"
)
public class AddressMapperImpl extends AddressDecorator implements AddressMapper {

    private final AddressMapper delegate;

    public AddressMapperImpl() {
        this( new AddressMapperImpl_() );
    }

    private AddressMapperImpl(AddressMapperImpl_ delegate) {
        super( delegate );
        this.delegate = delegate;
    }

    @Override
    public AddressDto updateAddressDtoFromAddress(Address address, AddressDto addressDto)  {
        return delegate.updateAddressDtoFromAddress( address, addressDto );
    }


    @Override
    public Address updateAddressFromAddressDto(AddressDto addressDto, Address address)  {
        return delegate.updateAddressFromAddressDto( addressDto, address );
    }

}
