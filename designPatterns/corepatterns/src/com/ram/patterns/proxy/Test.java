package com.ram.patterns.proxy;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Customer customer = new CustomerProxyImpl();
		
		System.out.println(customer.getId());
		List<Order> orders = customer.getOrders();
		for(Order order : orders)
		{
			System.out.println(order);
		}
	}

}
