package com.ram.patterns.movietickets.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ram.patterns.movietickets.entities.Ticket;

@Repository
public class TicketImpl implements TicketDAO {

	private static final String sql = "insert into  MOVIE.TICKET (MOVIE,SCREEN,SEAT) values (?,?,?)";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Ticket ticket) {
		
		jdbcTemplate.update(sql,ticket.getMovie(),ticket.getScreen(),ticket.getSeat());
	}

}
