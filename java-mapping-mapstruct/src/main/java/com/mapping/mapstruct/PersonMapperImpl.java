package com.mapping.mapstruct;

import com.mapping.bean.Address;
import com.mapping.bean.AddressDto;
import com.mapping.bean.Person;
import com.mapping.bean.PersonDto;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2014-10-02T00:13:13-0400"
)
public class PersonMapperImpl implements PersonMapper {

    private final AddressMapper addressMapper = Mappers.getMapper( AddressMapper.class );

    @Override
    public List<AddressDto> addressToAddressDto(List<Address> address)  {
        if ( address == null ) {
            return null;
        }

        List<AddressDto> list = new ArrayList<AddressDto>();

        for ( Address address_ : address ) {
            list.add( addressMapper.addressToAddressDto( address_ ) );
        }

        return list;
    }


    @Override
    public PersonDto personToPersonDto(Person person)  {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();
        personDto.setName( person.getFirstName() );
        personDto.setAddresses( addressToAddressDto( person.getAddresses() ) );
        personDto.setPhoneNumbers( phoneToPhoneDto( person.getPhoneNumbers() ) );
        if ( person.getAge() != null ) {
            personDto.setAge( person.getAge() );
        }

        return personDto;
    }


    @Override
    public List<String> phoneToPhoneDto(List<BigInteger> phoneNumbers)  {
        if ( phoneNumbers == null ) {
            return null;
        }

        List<String> list = new ArrayList<String>();

        for ( BigInteger bigInteger : phoneNumbers ) {
            list.add( bigInteger.toString() );
        }

        return list;
    }

}
