package com.ram.patterns.facade;



public class OrderProcessor {
	public boolean checkStock(String Name)
	{
		System.out.println("Checking Stock "+ Name);
		return true;
	}
	
	public double placeOrder(String name, int qty)
	{
		System.out.println("Order Placed for "+ name + " for "+ qty);
		return Math.random();
	}
	
	public void shipOrder(double orderNumber)
	{
		System.out.println("Order no "+ orderNumber + " is shipped");
	}
}
