package com.ram.patterns.movietickets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ram.patterns.movieticket.businessobject.Ticket;
import com.ram.patterns.movietickets.services.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket()
	{
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(Ticket ticket, ModelMap modelMap)
	{
		service.purchaseTicket(ticket);
		modelMap.addAttribute("msg","Ticket Purchased Successfully!");
		return "createTicket";
	}
}
