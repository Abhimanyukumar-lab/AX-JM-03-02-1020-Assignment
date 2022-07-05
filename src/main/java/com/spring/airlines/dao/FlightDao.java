package com.spring.airlines.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.airlines.modal.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Long> {
    

    



}
