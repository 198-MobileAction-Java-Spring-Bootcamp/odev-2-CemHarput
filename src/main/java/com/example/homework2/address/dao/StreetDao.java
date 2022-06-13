package com.example.homework2.address.dao;

import com.example.homework2.address.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetDao extends JpaRepository<Street, Long> {
}
