package com.example.demo.main;

import java.util.Date;

public class OrderLine {

	private Item item;
	private Date ETA;
	private Status orderLineStatus;
	private Address address;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Date getETA() {
		return ETA;
	}

	public void setETA(Date eTA) {
		ETA = eTA;
	}

	public Status getOrderLineStatus() {
		return orderLineStatus;
	}

	public void setOrderLineStatus(Status orderLineStatus) {
		this.orderLineStatus = orderLineStatus;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
