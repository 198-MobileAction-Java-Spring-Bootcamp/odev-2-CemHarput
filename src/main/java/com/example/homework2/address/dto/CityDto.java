package com.example.homework2.address.dto;

import com.example.homework2.address.entity.County;
import lombok.Data;

import javax.persistence.*;

@Data
public class CityDto {


    private Long id;



    private String name;


    private String plate;


    private CountyDto county;
}
