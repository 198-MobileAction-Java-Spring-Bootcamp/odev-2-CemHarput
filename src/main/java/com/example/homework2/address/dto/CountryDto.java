package com.example.homework2.address.dto;

import com.example.homework2.address.entity.City;
import lombok.Data;

import javax.persistence.*;

@Data
public class CountryDto {


    private Long id;


    private String Code;


    private String name;


    private CityDto city;
}
