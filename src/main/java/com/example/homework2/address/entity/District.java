package com.example.homework2.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "district")
@Getter
@Setter
public class District {

    @Id
    @GeneratedValue(generator = "District")
    @SequenceGenerator(name = "District" , sequenceName = "District_ID_SEQ")
    private Long id;

    @Column(name = "district_name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ADDRESS_STREET")
    private Street street;
}
