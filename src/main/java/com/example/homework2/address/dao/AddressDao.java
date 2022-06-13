package com.example.homework2.address.dao;

import com.example.homework2.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository<Address,Long> {
}
