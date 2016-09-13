package com.theater.domain;

import java.util.Date;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class Ticket {
    private Event event;
    private Date airDate;
    private int seat;
    private User user;

    public Ticket() {
    }

    public Event getEvent() {

        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "event=" + event +
                ", airDate=" + airDate +
                ", seat=" + seat +
                ", user=" + user +
                '}';
    }
}
