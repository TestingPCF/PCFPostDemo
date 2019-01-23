package com.hcl.pcf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.pcf.dao.TicketBookingDao;
import com.hcl.pcf.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

}
