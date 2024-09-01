package com.ram.patterns.iterator;

public class Test {

	public static void main(String[] args) {
		ProductCollection products = new ProductCollection();
		products.addProduct(new Product("apples"));
		products.addProduct(new Product("pineaapples"));
		products.addProduct(new Product("chikoo"));
		
		Iterator iterator = products.createIterator();
		
		while (iterator.hasNext())
		{
			Product p = (Product)iterator.next();
			System.out.println(p);
		}

	}

}
