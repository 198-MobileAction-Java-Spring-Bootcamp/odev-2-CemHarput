package com.example.homework2.address.dao;

import com.example.homework2.address.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country,Long> {
}
