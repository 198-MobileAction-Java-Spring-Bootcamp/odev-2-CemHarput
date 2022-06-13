package com.example.homework2.address.dto;

import com.example.homework2.address.entity.Street;
import lombok.Data;

import javax.persistence.*;

@Data
public class DistrictDto {


    private Long id;


    private String name;


    private StreetDto street;
}
