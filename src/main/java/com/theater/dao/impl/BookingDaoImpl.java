package com.theater.dao.impl;

import com.theater.dao.BookingDao;
import com.theater.domain.Ticket;
import com.theater.domain.User;

import java.util.*;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class BookingDaoImpl implements BookingDao {

    private static Map<User, List<Ticket>> booking;

    public boolean save(User user, Ticket ticket) {
        List<Ticket> tickets = booking.get(user);
        if (tickets == null) {
            booking.put(user, Arrays.asList(ticket));
        } else {
            return tickets.add(ticket);
        }
        return true;
    }

    public boolean save(User user, List<Ticket> ticket) {
        List<Ticket> tickets = booking.get(user);
        if (tickets == null) {
            booking.put(user, ticket);
        } else {
            return tickets.addAll(ticket);
        }
        return true;
    }

    public boolean remove(User user) {
        booking.remove(user);
        return true;
    }

    public List<Ticket> getTicket(User user) {
        return booking.get(user);
    }
}
