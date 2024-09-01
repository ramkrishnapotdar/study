package com.ram.frontcontroller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Comand {
	String execute(HttpServletRequest request, HttpServletResponse response);
}
