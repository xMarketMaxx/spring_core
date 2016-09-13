package com.theater.service.booking;

import com.theater.domain.Event;
import com.theater.domain.Ticket;
import com.theater.domain.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface BookingService {
    int getTicketsPrice(Event event, Date dateTime, User user, List<Integer> seats);

    boolean bookTicket(Ticket ticket);

    boolean bookTicket(List<Ticket> tickets);

    List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime);
}
