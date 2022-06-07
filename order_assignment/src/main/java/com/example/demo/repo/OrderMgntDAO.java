package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.main.Order;

@Repository
public interface OrderMgntDAO extends JpaRepository<Order, Integer>{

}