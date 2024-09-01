package com.ram.patterns.iterator;

public class ProductCollection implements Collection {
	int numberOFProducts = 0;
	Product[] products;
	
	public ProductCollection() 
	{
		products = new Product[10];
	}
	
	public boolean addProduct(Product product)
	{
		if(numberOFProducts < 10)
		{
			products[numberOFProducts] = product;
			numberOFProducts++;
			return true;
		}
		else
			return false;
	}

	@Override
	public Iterator createIterator() {
		return new ProductIterator(products);
		
	}
}
