package com.ram.patterns.command;

public class OffComand implements Command {

	Television TV;
	
	public OffComand(Television TV1) {
		this.TV = TV1;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		TV.off();
	}

}
