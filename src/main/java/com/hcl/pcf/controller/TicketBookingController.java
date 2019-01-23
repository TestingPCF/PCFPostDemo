package com.hcl.pcf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pcf.entities.Ticket;
import com.hcl.pcf.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

}
