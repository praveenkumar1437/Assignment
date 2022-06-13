package com.example.demo.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.main.Order;
import com.example.demo.main.OrderLine;
import com.example.demo.repo.OrderMgntDAO;

@RunWith(MockitoJUnitRunner.class)
class OrderMgntServiceTest {

	@InjectMocks
	OrderMgntService orderMgntService;

	@Mock
	OrderMgntDAO orderMgntDAO;

	@Test
	public void getOrderById() {
		Order orderById = null;
		try {
			Optional<Order> order = Optional.of(new Order());
			when(orderMgntDAO.findById(1)).thenReturn(order);
			orderById = orderMgntService.getOrderById(1);
		} catch (Exception e) {
			// Logging
		}
		assertNotNull(orderById);
	}

	@Test
	public void getOrderByPincode() {
		Order orderByPincode = null;
		try {
			Order order = new Order();
			order.setOrderId(1);
			order.setTotalAmount(1000f);
			order.setOrderDate("10-06-2022");
			when(orderMgntDAO.getOrderByPincode(123456)).thenReturn(order);
			orderByPincode = orderMgntService.getOrderByPincode(123456);
		} catch (Exception e) {
			// Logging
		}
		assertNotNull(orderByPincode);
	}

	@Test
	public void saveOrder() {
		Order saveOrder = null;
		try {
			List<OrderLine> arrayList = new ArrayList<>();
			Order order = new Order();
			order.setOrderId(1);
			order.setTotalAmount(1000f);
			order.setOrderDate("10-06-2022");
			when(orderMgntDAO.save(order)).thenReturn(order);
			saveOrder = orderMgntService.saveOrder(arrayList);
		} catch (Exception e) {
			// Logging
		}
		assertNotNull(saveOrder);
	}

}
