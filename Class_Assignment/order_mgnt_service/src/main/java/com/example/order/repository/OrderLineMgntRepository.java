package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.order.entity.OrderLine;

public interface OrderLineMgntRepository extends JpaRepository<OrderLine, Integer>{

}
