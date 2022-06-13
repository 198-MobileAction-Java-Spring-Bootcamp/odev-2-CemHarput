package com.example.homework2.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(generator = "Country")
    @SequenceGenerator(name = "Country" , sequenceName = "COUNTRY_ID_SEQ")
    private Long id;

    @Column(name = "country_code" ,length = 5)
    private String Code;

    @Column(name = "country_name",length = 30)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ADDRESS_CITY")
    private City city;




}
