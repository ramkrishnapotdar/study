package com.ram.patterns.command;

public class OnComand implements Command {

	Television TV;
	
	public OnComand(Television TV1) {
		this.TV = TV1;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		TV.on();
	}

}
