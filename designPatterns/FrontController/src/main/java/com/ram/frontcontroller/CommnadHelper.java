package com.ram.frontcontroller;

public class CommnadHelper {

	public Comand getComand(String requestURI) {
		
		if(requestURI.contains("viewStudentDetails.do"))
		{
			return new ViewStudentCommand();
		}
		return null;
		
	}

}
