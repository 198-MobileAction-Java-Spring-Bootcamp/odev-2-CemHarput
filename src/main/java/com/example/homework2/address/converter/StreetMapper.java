package com.example.homework2.address.converter;


import com.example.homework2.address.dto.AddressDto;
import com.example.homework2.address.dto.StreetDto;
import com.example.homework2.address.dto.StreetSaveRequestDto;
import com.example.homework2.address.entity.Address;
import com.example.homework2.address.entity.Street;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StreetMapper {

    StreetMapper INSTANCE = Mappers.getMapper(StreetMapper.class);

    Street convertToStreet(StreetSaveRequestDto streetSaveRequestDto);
    StreetDto convertToStreetDto(Street street);
    List<StreetDto> convertToStreetDtoList(List<Street> streetList);
}
