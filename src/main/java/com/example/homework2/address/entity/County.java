package com.example.homework2.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "county")
@Getter
@Setter
public class County {

    @Id
    @GeneratedValue(generator = "County")
    @SequenceGenerator(name = "County" , sequenceName = "COUNTY_ID_SEQ")
    private Long id;


    @Column(name = "county_name")
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ADDRESS_DISTRICT")
    private District district;



}
