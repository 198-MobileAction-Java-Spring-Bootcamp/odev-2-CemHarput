package com.example.homework2.address.dto;

import com.example.homework2.address.entity.District;
import lombok.Data;

import javax.persistence.*;

@Data
public class CountyDto {


    private Long id;



    private String name;



    private DistrictDto district;
}
