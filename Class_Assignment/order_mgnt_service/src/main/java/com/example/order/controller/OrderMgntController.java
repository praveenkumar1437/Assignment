package com.example.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.entity.OrderProducts;
import com.example.order.service.OrderMgntService;

@RestController
public class OrderMgntController {
	
	@Autowired
	private OrderMgntService orderMgntService;

	@PostMapping("/saveOrder")
	public OrderProducts saveOrder(@RequestBody OrderProducts orderProducts) {
		OrderProducts order = null;
		if(orderProducts!=null) {
			order = orderMgntService.saveOrder(orderProducts);
		}
		return order;
	}

	@GetMapping("/getOrderById/{orderId}")
	public OrderProducts getOrderById( @PathVariable Integer orderId) {
		OrderProducts order = null;
		if(orderId!=null) {
			order = orderMgntService.getOrderById(orderId);
		}
		return order;
	}
	
	@GetMapping("/getOrdersByPincode/{pincode}")
	public List<OrderProducts> getOrdersByPincode(@PathVariable Integer pincode) {
		List<OrderProducts> ordersList= null;
		if(pincode!=null) {
			ordersList = orderMgntService.getOrdersByPincode(pincode);
		}
		return ordersList;
	}
}
