package com.ram.patterns.frontcontroller;



public class CommandHelper {
	public Command getComand(String requestURI) {
		
		if(requestURI.contains("ViewStudentDetails.do"))
		{
			return new ViewStudentCommand();
		}
		return null;
		
	}

}
