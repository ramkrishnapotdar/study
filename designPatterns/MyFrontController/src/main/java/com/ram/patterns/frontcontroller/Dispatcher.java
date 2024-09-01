package com.ram.patterns.frontcontroller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dispatcher {

	

	public Dispatcher() {
		// TODO Auto-generated constructor stub
	}

	public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		if(view != null)
			 requestDispatcher = request.getRequestDispatcher("index2.jsp");
		else
			 requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	}


}
