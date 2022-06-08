package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.main.Order;
import com.example.demo.main.OrderLine;
import com.example.demo.repo.OrderMgntDAO;

@Service
public class OrderMgntService {

	@Autowired
	private OrderMgntDAO orderMgntDAO;

	public Order getOrderById(Integer id) throws Exception {
		Optional<Order> findById = orderMgntDAO.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		throw new Exception("there is no order available with order id : " + id);
	}

	public Order saveOrder(List<OrderLine> orderline) {
		Order order = new Order();
		order.setAddress(orderline.get(0).getAddress());
		order.setOrderDate(LocalDate.now().toString());
		order.setOrderLinesList(orderline);
		return orderMgntDAO.save(order);
	}

	public Order getOrderByPincode(int pincode) {

		return null;
	}
}
