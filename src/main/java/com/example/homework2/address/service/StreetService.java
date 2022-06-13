package com.example.homework2.address.service;


import com.example.homework2.address.converter.StreetMapper;
import com.example.homework2.address.dto.StreetDto;
import com.example.homework2.address.dto.StreetSaveRequestDto;
import com.example.homework2.address.entity.Street;
import com.example.homework2.address.service.entityservice.StreetServiceEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StreetService {

    private final StreetServiceEntityService streetServiceEntityService;

    public StreetDto save(StreetSaveRequestDto streetSaveRequestDto) {

        Street street = StreetMapper.INSTANCE.convertToStreet(streetSaveRequestDto);

        street = streetServiceEntityService.save(street);

        StreetDto streetDto  = StreetMapper.INSTANCE.convertToStreetDto(street);

        return streetDto;


    }
}
