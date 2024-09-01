package com.ram.patterns.frontcontroller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class MyFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		System.out.println(requestURI);
		CommandHelper helper = new CommandHelper();
		Command command = helper.getComand(requestURI);
		String view = command.execute(request, response);
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch(request,response,view);
	}

}
