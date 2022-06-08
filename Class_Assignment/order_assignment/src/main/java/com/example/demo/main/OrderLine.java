package com.example.demo.main;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order_line")
public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Item item;
	private Date ETA;
	private Status orderLineStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	private Order order;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
