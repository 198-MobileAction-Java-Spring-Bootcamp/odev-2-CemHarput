package com.example.homework2.address.converter;

import com.example.homework2.address.dto.AddressDto;
import com.example.homework2.address.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressDto addressDto);
    AddressDto convertToAddressDto(Address address);
    List<AddressDto> convertToAddressDtoList(List<Address> addressList);
}
