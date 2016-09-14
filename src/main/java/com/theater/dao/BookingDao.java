package com.theater.dao;

import com.theater.domain.Ticket;
import com.theater.domain.User;

import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface BookingDao {
    boolean save(User user, Ticket ticket);

    boolean save(User user, List<Ticket> ticket);

    boolean remove(User user);

    List<Ticket> getTicket(User user);
}
