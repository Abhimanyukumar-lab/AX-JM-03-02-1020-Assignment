package com.spring.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.airlines.Service.BookingImpl;
import com.spring.airlines.modal.Booking;

@RestController
public class BookingController {
    
    @Autowired
    private BookingImpl bookingImpl;


    @GetMapping("/booking")
    public List<Booking> gettingBookingList(){
        return bookingImpl.gettingBookingList();
    }


}
