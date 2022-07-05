package com.spring.airlines.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Passenger {

    @Id
    private Long passId;
    private String name;

    @JsonBackReference
    @ManyToOne
    private Booking booking;



    public Passenger() {
    }

    public Passenger(Long passId, String name) {
        this.passId = passId;
        this.name = name;
    }

    public Long getPassId() {
        return passId;
    }

    public void setPassId(Long passId) {
        this.passId = passId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    

}
