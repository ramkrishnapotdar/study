package com.ram.patterns.iterator;

public class ProductIterator implements Iterator {

	Product[] products;
	int position = 0;
	
	public ProductIterator(Product[] products) 
	{
		this.products = products;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= products.length || products[position] == null)
			return false;	
		else
			return true;
	}

	@Override
	public Object next() {
	
		return products[position++];
	}

}
