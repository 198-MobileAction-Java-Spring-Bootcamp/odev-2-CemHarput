package com.example.homework2.address.dao;

import com.example.homework2.address.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Long> {
}
