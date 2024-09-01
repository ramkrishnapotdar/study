package com.ram.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.patterns.movieticket.businessobject.Ticket;
import com.ram.patterns.movietickets.dao.TicketDAO;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDAO DAO;
	
	@Override
	public void purchaseTicket(Ticket ticket) {
		//process payment here
		com.ram.patterns.movietickets.entities.Ticket ticketEntity = new com.ram.patterns.movietickets.entities.Ticket();
		
		ticketEntity.setId(ticket.getId());
		ticketEntity.setScreen(ticket.getScreen_name());
		ticketEntity.setMovie(ticket.getMovie_name());
		ticketEntity.setSeat(ticket.getSeat_number());
		
		DAO.create(ticketEntity);
		//email or text msg ticket details
	}

}
