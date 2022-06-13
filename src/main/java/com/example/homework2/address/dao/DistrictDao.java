package com.example.homework2.address.dao;

import com.example.homework2.address.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictDao extends JpaRepository<District,Long> {
}
