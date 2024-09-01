package com.ram.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer {

	private int id;
	private List<Order> OrderList;
	
	
	
	public CustomerImpl() {
		this.id = 123;
	}

	public List<Order> getOrdersList() {
		return OrdersList;
	}

	public void setOrdersList(List<Order> ordersList) {
		OrdersList = ordersList;
	}

	public void setId(int id) {
		this.id = id;
	}

	private List<Order> OrdersList;
	@Override
	public int getId() {
		
		return this.id;
	}

	@Override
	public List<Order> getOrders() {
		return null;
	}

	@Override
	public String toString() {
		return "CustomerImpl [id=" + id + ", OrderList=" + OrderList + ", OrdersList=" + OrdersList + "]";
	}
	
	

}
