package com.spring.airlines.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.airlines.dao.FlightDao;
import com.spring.airlines.modal.Flight;

// import antlr.collections.List;

@Service
public class FlightImpl {

    @Autowired
    private FlightDao flightDao;
    
    public Flight saveFlight(Flight flight) {
    	return flightDao.save(flight);
    }
    

    public List<Flight> gettingFlightList() {
        return flightDao.findAll();
    }

}
