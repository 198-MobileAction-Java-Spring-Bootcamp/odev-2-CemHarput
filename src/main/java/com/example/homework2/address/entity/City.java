package com.example.homework2.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(generator = "City")
    @SequenceGenerator(name = "City" , sequenceName = "CITY_ID_SEQ")
    private Long id;


    @Column(name = "city_name")
    private String name;

    @Column(name = "license_plate")
    private String plate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ADDRESS_COUNTY")
    private County county;





}
