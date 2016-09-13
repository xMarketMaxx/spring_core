package com.theater.domain;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class Event {
    private String name;
    private int price;
    private RATING rating;

    public enum RATING{
        LOW, MID, HIGH
    }
}
