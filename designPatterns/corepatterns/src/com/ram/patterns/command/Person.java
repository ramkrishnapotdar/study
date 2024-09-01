package com.ram.patterns.command;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		RemoteControl rc = new RemoteControl();
		
		OnComand onCommand = new OnComand(tv);
		rc.setCmd(onCommand);
		rc.pressButton();
		

	}

}
