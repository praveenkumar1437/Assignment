package com.example.order.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.order.entity.Address;
import com.example.order.entity.OrderLine;
import com.example.order.entity.OrderLineStatus;
import com.example.order.entity.OrderProducts;
import com.example.order.entity.OrderStatus;
import com.example.order.repository.OrderMgntRepository;

@SpringBootTest
class OrderMgntServiceTest {

	@Autowired
	private OrderMgntService orderMgntService;

	@MockBean
	private OrderMgntRepository orderMgntRepository;

	@Test
	public void saveOrderTest() {

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("atp");
		address.setCountry("india");
		address.setPin(111111);

		OrderLine orderLine = new OrderLine();
		orderLine.setOrderlineId(2);
		orderLine.setItem("laptop");
		orderLine.setPrice(60000);
		orderLine.setQuantity(1);
		orderLine.setEta(2);
		orderLine.setOrderLineStatus(OrderLineStatus.open);

		OrderProducts orderProducts = new OrderProducts();
		orderProducts.setOrderId(3);
		orderProducts.setTotalAmount(60000);
		orderProducts.setOrderDate("01-01-2022");
		orderProducts.setOrderStatus(OrderStatus.open);
		orderProducts.setAddress(address);
		List<OrderLine> orderlinesList = new ArrayList<>();
		orderlinesList.add(orderLine);
		orderProducts.setOrderlines(orderlinesList);

		Mockito.when(orderMgntRepository.save(orderProducts)).thenReturn(orderProducts);
		assertThat(orderMgntService.saveOrder(orderProducts)).isEqualTo(orderProducts);
	}

	@Test
	public void getOrdersByPincodeWithMatchingValueTest() {

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("atp");
		address.setCountry("india");
		address.setPin(111111);

		OrderLine orderLine = new OrderLine();
		orderLine.setOrderlineId(2);
		orderLine.setItem("laptop");
		orderLine.setPrice(60000);
		orderLine.setQuantity(1);
		orderLine.setEta(2);
		orderLine.setOrderLineStatus(OrderLineStatus.open);

		OrderProducts orderProducts = new OrderProducts();
		List<OrderLine> orderlinesList = new ArrayList<>();
		orderlinesList.add(orderLine);
		orderProducts.setOrderId(3);
		orderProducts.setTotalAmount(60000);
		orderProducts.setOrderDate("01-01-2022");
		orderProducts.setOrderStatus(OrderStatus.open);
		orderProducts.setAddress(address);
		orderProducts.setOrderlines(orderlinesList);

		List<OrderProducts> ordersList = new ArrayList<>();
		ordersList.add(orderProducts);

		Integer pincode = 111111;
		Mockito.when(orderMgntRepository.findAll()).thenReturn(ordersList);
		List<OrderProducts> resultingOrdersList = orderMgntService.getOrdersByPincode(pincode);
		assertEquals(pincode, resultingOrdersList.get(0).getAddress().getPin());

	}

	@Test
	public void gOrdersByPincodeWithoutMatchingValueTest() {

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("atp");
		address.setCountry("india");
		address.setPin(111111);

		OrderLine orderLine = new OrderLine();
		orderLine.setOrderlineId(2);
		orderLine.setItem("laptop");
		orderLine.setPrice(60000);
		orderLine.setQuantity(1);
		orderLine.setEta(2);
		orderLine.setOrderLineStatus(OrderLineStatus.open);

		OrderProducts orderProducts = new OrderProducts();
		List<OrderLine> orderlinesList = new ArrayList<>();
		orderlinesList.add(orderLine);
		orderProducts.setOrderId(3);
		orderProducts.setTotalAmount(60000);
		orderProducts.setOrderDate("01-01-2022");
		orderProducts.setOrderStatus(OrderStatus.open);
		orderProducts.setAddress(address);
		orderProducts.setOrderlines(orderlinesList);

		List<OrderProducts> ordersList = new ArrayList<>();
		ordersList.add(orderProducts);

		Mockito.when(orderMgntRepository.findAll()).thenReturn(ordersList);
		List<OrderProducts> resultingOrdersList = orderMgntService.getOrdersByPincode(111112);
		assertEquals(new ArrayList<>(), resultingOrdersList);

	}

	@Test
	public void getOrderByIdWithMatchingValueTest() {

		Address address = new Address();
		address.setAddressId(1);
		address.setCity("atp");
		address.setCountry("india");
		address.setPin(111111);

		OrderLine orderLine = new OrderLine();
		orderLine.setOrderlineId(2);
		orderLine.setItem("laptop");
		orderLine.setPrice(60000);
		orderLine.setQuantity(1);
		orderLine.setEta(2);
		orderLine.setOrderLineStatus(OrderLineStatus.open);

		OrderProducts orderProducts = new OrderProducts();
		List<OrderLine> orderlinesList = new ArrayList<>();
		orderlinesList.add(orderLine);
		orderProducts.setOrderId(3);
		orderProducts.setTotalAmount(60000);
		orderProducts.setOrderDate("01-01-2022");
		orderProducts.setOrderStatus(OrderStatus.open);
		orderProducts.setAddress(address);
		orderProducts.setOrderlines(orderlinesList);

		Mockito.when(orderMgntRepository.findById(3)).thenReturn(Optional.ofNullable(orderProducts));
		assertThat(orderMgntService.getOrderById(3)).isEqualTo(orderProducts);
	}

}
