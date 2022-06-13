package com.example.homework2.address.dto;

import com.example.homework2.address.entity.*;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
public class AddressDto {


    private Long Id;


    private CountryDto country;


    private CityDto city;


    private CountyDto county;


    private DistrictDto district;


    private StreetDto street;


    private BigDecimal DoorNum;


    private BigDecimal HomeNum;
}
