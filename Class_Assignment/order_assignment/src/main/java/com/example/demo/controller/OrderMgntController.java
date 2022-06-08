package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.main.Order;
import com.example.demo.main.OrderLine;
import com.example.demo.service.OrderMgntService;

@RestController
@RequestMapping(value = "/order")
public class OrderMgntController {

	@Autowired
	private OrderMgntService orderMgntService;
	
	@PostMapping("/saveOrder")
	public Order saveOrder(@RequestBody List<OrderLine> orderline) {
		return orderMgntService.saveOrder(orderline);
	}

	@GetMapping("/getOrderById/{orderId}")
	public Order getOrderById(@PathVariable Integer orderId) throws Exception {
		return orderMgntService.getOrderById(orderId);
	}
	
	@GetMapping("/getOrderByPincode/{pincode}")
	public Order getOrderByPincode(@PathVariable int pincode) {
		return orderMgntService.getOrderByPincode(pincode);
	}
}
