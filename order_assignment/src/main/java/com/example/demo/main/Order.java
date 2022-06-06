package com.example.demo.main;

import java.util.Date;
import java.util.List;

public class Order {

	private int orderId;
	private float totalAmount;
	private Date orderDate;
	private Status orderStatus;
	private List<OrderLine> orderLinesList;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderLine> getOrderLinesList() {
		return orderLinesList;
	}

	public void setOrderLinesList(List<OrderLine> orderLinesList) {
		this.orderLinesList = orderLinesList;
	}

}
