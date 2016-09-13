package com.theater.service.discount;

import com.theater.domain.Event;
import com.theater.domain.User;

import java.util.Date;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public interface DiscountService {
    int getDiscount(User user, Event event, Date dateTime, int numberOfTickets);
}
