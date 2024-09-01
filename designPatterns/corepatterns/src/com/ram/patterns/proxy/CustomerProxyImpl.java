package com.ram.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {

	CustomerImpl customer = new CustomerImpl();
	
	@Override
	public int getId() {
		
		return customer.getId();
		
	}

	@Override
	public List<Order> getOrders() {
		
		ArrayList<Order> orders = new ArrayList<Order>();
		
		Order order = new Order();
		order.setId(1);
		order.setProductName("ABC");
		orders.add(order);
		
		Order order2 = new Order();
		order2.setId(2);
		order2.setProductName("sadas");
		orders.add(order2);
		
		return orders;
	}

	
	
}
