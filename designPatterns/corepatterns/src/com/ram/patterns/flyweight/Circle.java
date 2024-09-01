package com.ram.patterns.flyweight;

public class Circle extends Shape{

	private String label;
	private int radious;
	
	Circle()
	{
		label = "Circle";
				
	}
	@Override
	public void draw(int radious) {
		System.out.println("Drawing a " + label + " with r = " + radious);
	}
	@Override
	public void draw(int length, int breadth) {
		// TODO Auto-generated method stub
		
	} 
	
	
	
}
