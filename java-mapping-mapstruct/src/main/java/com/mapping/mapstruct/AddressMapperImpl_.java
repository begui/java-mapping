package com.mapping.mapstruct;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2014-10-02T00:13:13-0400"
)
public class AddressMapperImpl_ implements AddressMapper {

    @Override
    public Address addressDtoToAddress(AddressDto address)  {
        if ( address == null ) {
            return null;
        }

        Address address_ = new Address();
        address_.setStreet( address.getStreet() );
        address_.setCity( address.getCity() );
        address_.setBlock( address.getBlock() );
        address_.setState( address.getState() );
        address_.setPrimary( String.valueOf( address.isPrimary() ) );
        if ( address.getZip() != null ) {
            address_.setZip( String.valueOf( address.getZip() ) );
        }

        return address_;
    }


    @Override
    public AddressDto addressToAddressDto(Address address)  {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();
        addressDto.setStreet( address.getStreet() );
        addressDto.setCity( address.getCity() );
        addressDto.setBlock( address.getBlock() );
        addressDto.setState( address.getState() );
        if ( address.getPrimary() != null ) {
            addressDto.setPrimary( Boolean.parseBoolean( address.getPrimary() ) );
        }
        if ( address.getZip() != null ) {
            addressDto.setZip( Integer.parseInt( address.getZip() ) );
        }
        addressDto.setStreetLine( address.getBlock() + " " + address.getStreet() );

        return addressDto;
    }


    @Override
    public AddressDto updateAddressDtoFromAddress(Address address, AddressDto addressDto)  {
        if ( address == null ) {
            return null;
        }


        addressDto.setStreet( address.getStreet() );
        addressDto.setCity( address.getCity() );
        addressDto.setBlock( address.getBlock() );
        addressDto.setState( address.getState() );
        if ( address.getPrimary() != null ) {
            addressDto.setPrimary( Boolean.parseBoolean( address.getPrimary() ) );
        }
        if ( address.getZip() != null ) {
            addressDto.setZip( Integer.parseInt( address.getZip() ) );
        }
        addressDto.setStreetLine( address.getBlock() + " " + address.getStreet() );

        return addressDto;
    }


    @Override
    public Address updateAddressFromAddressDto(AddressDto addressDto, Address address)  {
        if ( addressDto == null ) {
            return null;
        }


        address.setStreet( addressDto.getStreet() );
        address.setCity( addressDto.getCity() );
        address.setBlock( addressDto.getBlock() );
        address.setState( addressDto.getState() );
        address.setPrimary( String.valueOf( addressDto.isPrimary() ) );
        if ( addressDto.getZip() != null ) {
            address.setZip( String.valueOf( addressDto.getZip() ) );
        }

        return address;
    }

}
