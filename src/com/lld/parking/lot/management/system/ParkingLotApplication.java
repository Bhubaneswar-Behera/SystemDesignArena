package com.lld.parking.lot.management.system;

import com.lld.parking.lot.management.system.controllers.TicketController;
import com.lld.parking.lot.management.system.dtos.IssueTicketRequestDto;
import com.lld.parking.lot.management.system.dtos.IssueTicketResponseDto;
import com.lld.parking.lot.management.system.factories.ParkingSpotAssignmentStrategyFactory;
import com.lld.parking.lot.management.system.models.ParkingSpotStrategyType;
import com.lld.parking.lot.management.system.models.Ticket;
import com.lld.parking.lot.management.system.repositories.GateRepository;
import com.lld.parking.lot.management.system.repositories.VehicleRepository;
import com.lld.parking.lot.management.system.services.TicketService;
import com.lld.parking.lot.management.system.strategies.ParkingSpotAssignmentStrategy;

public class ParkingLotApplication {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy =
                ParkingSpotAssignmentStrategyFactory.getParkingLotStrategy(ParkingSpotStrategyType.NEAREST);

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository,
                parkingSpotAssignmentStrategy);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setOperatorId(345L);
        requestDto.setOwnerName("Shivam");
        requestDto.setVehicleNumber("KA01X1111");

        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
        Ticket ticket = responseDto.getTicket();
    }
}
