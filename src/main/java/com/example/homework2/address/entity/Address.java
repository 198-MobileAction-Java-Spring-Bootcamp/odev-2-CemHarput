package com.example.homework2.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {


    @javax.persistence.Id
    @GeneratedValue(generator = "Address")
    @SequenceGenerator(name = "Address" , sequenceName = "ADDRESS_ID_SEQ")
    private Long Id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_name",referencedColumnName = "id")
    private Country country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_name",referencedColumnName = "id")
    private City city;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "county_name",referencedColumnName = "id")
    private County county;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_name",referencedColumnName = "id")
    private District district;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street_name",referencedColumnName = "id")
    private Street street;

    @Column(name = "DOORNUM")
    private BigDecimal DoorNum;

    @Column(name = "HOMENUM")
    private BigDecimal HomeNum;


}
