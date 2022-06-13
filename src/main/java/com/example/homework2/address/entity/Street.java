package com.example.homework2.address.entity;


import com.example.homework2.generic.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "street")
@Getter
@Setter
public class Street extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Street")
    @SequenceGenerator(name = "Street" , sequenceName = "STREET_ID_SEQ")
    private Long id;


    @Column(name = "street_name")
    private String name;



}
