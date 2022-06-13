package com.example.demo.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.main.Order;
import com.example.demo.main.OrderLine;
import com.example.demo.service.OrderMgntService;

@RunWith(MockitoJUnitRunner.class)
public class OrderMgntControllerTest {

	@InjectMocks
	OrderMgntController orderMgntController;

	@Mock
	OrderMgntService orderMgntService;

	@Test
	public void getOrderById() {
		Order orderById = null;
		try {
			Order order = new Order();
			order.setOrderId(1);
			order.setTotalAmount(1000f);
			order.setOrderDate("10-06-2022");
			when(orderMgntService.getOrderById(1)).thenReturn(order);
			orderById = orderMgntController.getOrderById(1);
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
			when(orderMgntService.getOrderByPincode(123456)).thenReturn(order);
			orderByPincode = orderMgntController.getOrderByPincode(123456);
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
			when(orderMgntService.saveOrder(arrayList)).thenReturn(order);
			saveOrder = orderMgntController.saveOrder(arrayList);
		} catch (Exception e) {
			// Logging
		}
		assertNotNull(saveOrder);
	}
}
