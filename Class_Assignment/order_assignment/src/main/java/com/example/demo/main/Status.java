package com.example.demo.main;

public class Status {

	public enum OrderStatus{
		OPEN, COMPLETED, CANCELLED
	}
	
	public enum OrderLineStatus{
		OPEN, INTRANSIT, DELIVERED, CANCELLED
	}
}
