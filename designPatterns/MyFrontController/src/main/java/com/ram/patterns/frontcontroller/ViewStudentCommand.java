package com.ram.patterns.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewStudentCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		Student S = new Student(1, "ram");
		request.setAttribute("StudentDetails", S);
		request.setAttribute("student", S);
		return "ViewStudentDetails";
	}

}
