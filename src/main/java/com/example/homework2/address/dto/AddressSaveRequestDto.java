package com.example.homework2.address.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddressSaveRequestDto {




    private String country;


    private String city;


    private String county;


    private String district;


    private String street;


    private BigDecimal DoorNum;


    private BigDecimal HomeNum;
}
