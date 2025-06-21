package com.lld.parking.lot.management.system.controllers;

import com.lld.parking.lot.management.system.dtos.*;
import com.lld.parking.lot.management.system.models.Ticket;
import com.lld.parking.lot.management.system.services.TicketService;


public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();

        try {
            Ticket ticket =  ticketService.issueTicket(
                    requestDto.getVehicleNumber(),
                    requestDto.getOwnerName(),
                    requestDto.getGateId(),
                    requestDto.getOperatorId()
            );

            responseDto.setTicket(ticket);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }

    public DeleteTicketResponseDto deleteTicket(DeleteTicketRequestDto requestDto) {
        return null;
    }
}