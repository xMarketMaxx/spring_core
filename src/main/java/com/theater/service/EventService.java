package com.theater.service;

import com.theater.domain.Event;
import com.theater.domain.User;

import java.util.Date;
import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface EventService {
    boolean save(Event event);
    boolean remove(Event event);
    Event getById(int id);
    Event getByName(Event event);
    List<Event> getAll();
    List<Event> getForDateRange(Date from, Date to);
    List<Event> getNextEvents(Date to);
}
