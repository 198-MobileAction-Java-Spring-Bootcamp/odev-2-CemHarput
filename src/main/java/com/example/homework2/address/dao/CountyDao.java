package com.example.homework2.address.dao;

import com.example.homework2.address.entity.County;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountyDao extends JpaRepository<County,Long> {
}
