package com.ram.patterns.flyweight;

public class Paint {
	public void render(int num)
	{
		Shape shape = null;
		for(int i=0; i < num; i++)
		{
			if(i%2==0)
			{
				shape = ShapeFactory.getShape("circle");
				shape.draw(i);
						
			}
			else {
				shape = ShapeFactory.getShape("rectangle");
				shape.draw(i,i+2);
				
			}
		}
	}
	
}
