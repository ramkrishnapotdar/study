package com.ram.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String requestURI = request.getRequestURI();
		CommnadHelper commnadHelper = new CommnadHelper();
		Comand comand = commnadHelper.getComand(requestURI);
		String view = comand.execute(request, response);
		
		Dispatcher dispatcher = new Dispatcher();
		dispatcher.dispatch(request,response,view);
		
	}

}

