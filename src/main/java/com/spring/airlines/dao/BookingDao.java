package com.spring.airlines.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.airlines.modal.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long>{
    


}
