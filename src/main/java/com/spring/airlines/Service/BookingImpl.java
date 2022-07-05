package com.spring.airlines.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.airlines.dao.BookingDao;
import com.spring.airlines.modal.Booking;

@Service
public class BookingImpl {

    @Autowired
    private BookingDao bookingDao;

    public List<Booking> gettingBookingList() {
        return bookingDao.findAll();
    }

}
