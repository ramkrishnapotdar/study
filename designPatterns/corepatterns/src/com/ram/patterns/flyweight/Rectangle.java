package com.ram.patterns.flyweight;

public class Rectangle extends Shape{

	private String label;
	private int length;
	private int breadth;
	
	Rectangle()
	{
		label = "Rectangle";
		
	}
	
	
	@Override
	public void draw(int radious) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(int length, int breadth) {
		System.out.println("Drawing a " + label + " with l nad b = " + length + " " + breadth);
	}
	
}
