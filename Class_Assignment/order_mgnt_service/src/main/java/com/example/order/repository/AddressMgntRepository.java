package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.entity.Address;

public interface AddressMgntRepository extends JpaRepository<Address, Integer>{

}
