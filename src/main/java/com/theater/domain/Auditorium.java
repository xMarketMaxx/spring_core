package com.theater.domain;

import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class Auditorium {
    private int id;
    private String name;
    private int seatsQuantity;
    private List<Integer> vipSeats;

    public Auditorium(int id, String name, int seatsQuantity, List<Integer> vipSeats) {
        this.id = id;
        this.name = name;
        this.seatsQuantity = seatsQuantity;
        this.vipSeats = vipSeats;
    }

    public List<Integer> getVipSeats() {
        return vipSeats;
    }


    public void setVipSeats(List<Integer> vipSeats) {
        this.vipSeats = vipSeats;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(int seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seatsQuantity=" + seatsQuantity +
                ", vipSeats=" + vipSeats +
                '}';
    }

}
