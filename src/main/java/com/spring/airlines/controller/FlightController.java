package com.spring.airlines.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.airlines.Service.FlightImpl;
import com.spring.airlines.modal.Flight;

@RestController
public class FlightController {

    @Autowired
    private FlightImpl flightImpl;

    @PostMapping("/flights")
    public Flight addFlight( @RequestBody Flight flight) {
    	return flightImpl.saveFlight(flight);
    }
    
    
    
    
    @GetMapping("/flight")
    public List<Flight> GEttingFlight() {
        return flightImpl.gettingFlightList();
    }

}
