package com.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.entity.OrderProducts;

@Repository
public interface OrderMgntRepository extends JpaRepository<OrderProducts, Integer> {

}
