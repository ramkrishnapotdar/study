package com.ram.patterns.facade;

public class Facade {
	OrderProcessor orderProcessor = new OrderProcessor();
	public void processAllorder(String name, int qty)
	{
		if(orderProcessor.checkStock(name))
		{
			
			double orderNumber = orderProcessor.placeOrder(name, qty);
			orderProcessor.shipOrder(orderNumber);
		}
	}
}
