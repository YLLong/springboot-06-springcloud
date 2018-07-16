package com.akria.ticket.controller;

import com.akria.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/buy")
    public String buyTicket() {
        return ticketService.getTicket();
    }

}
