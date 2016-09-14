package com.theater.utils;

import javax.xml.transform.sax.SAXSource;

/**
 * Created by Maksym_Pinchuk on 9/14/2016.
 */
public class Utils {

    public static void showMainMenu(){
        System.out.println("~~ WELCOME ~~");
        System.out.println("1. Events");
        System.out.println("2. Users");
        System.out.println("3. Tickets");
        System.out.println("4. Make reservation");
    }

    public static void showEventsMenu(){
        System.out.println("-- Events --");
        System.out.println("1. Show all events");
        System.out.println("2. Show events by date");
    }

    public static void showUsersMenu(){
        System.out.println("-- Users --");
        System.out.println("1. Show all users");
        System.out.println("2. Get user by id");
        System.out.println("3. Get user by email");
    }

    public static void showTicketsMenu(){
        System.out.println("-- Tickets --");
        System.out.println("1. Show tickets history");
        System.out.println("2. Show tickets for user");
    }

    public static void showReservationMenu(){
        System.out.println("-- Reservation --");
        System.out.println("1. Buy ticket for event");
        System.out.println("2. Sell ticket for event");
    }

}
