package com.ram.patterns.interceptingfilter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;


@WebFilter("/*")
public class UserAgentFilter extends HttpFilter implements Filter {
       

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		
		String UserAgentHeader = ((HttpServletRequest) request).getHeader("User-Agent");
		System.out.println(UserAgentHeader);
		if ( UserAgentHeader.contains("Chrome"))
					chain.doFilter(request, response);
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("badBrowser.jsp");
			requestDispatcher.forward(request, response);
		}
		
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
