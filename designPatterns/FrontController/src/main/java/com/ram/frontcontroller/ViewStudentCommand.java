package com.ram.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Comand {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		StudentValueObject SVO = new StudentValueObject(1, "ram"); 
		request.setAttribute("StudentDetails", SVO);
		return "showStudentDetails";
	}

}
