package com.rommel.Immfly.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rommel.Immfly.models.Flight;
import com.rommel.Immfly.repositories.FlightRepository;
import com.rommel.Immfly.services.FlightService;

/**
 *  Class that handles all the API requests comming to the microservice
 */
@RestController @RequestMapping("/v1/flight-information")
public class FlightController {

    private FlightRepository flightRepository;

    @Autowired
    FlightService flightService;

    /**
     * @param flightRepository which handles all connection with the Redis ddbb
     */
    public FlightController (FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    /**
     * 
     * Handles the endpoint "/v1/flight-information/{tailNumber}"
     * @param tailNumber 
     * @return Map<String, Flight> that contains all Flights related to a tailNumber
     */
    @GetMapping("{tailNumber}")
    public Map<String, Flight> findByTailNumber(@PathVariable String tailNumber)  {
        return flightService.getFlightsByTailNumber(tailNumber, flightRepository.findAll());
    }

    /**
     * 
     * Handles the endpoint "/v1/flight-information/{tailNumber}/{flightNumber}
     * @param tailNumber
     * @param flightNumber
     * @return Flight object with all information related to an specified flight, but need theese tu pararams in order
     */
    @GetMapping("{tailNumber}/{flightNumber}")
    public Flight findFlightsByTailNumberAndFlight(@PathVariable String tailNumber, @PathVariable String flightNumber)  {
        return flightService.getFlightByTailNumberAndFlightNumber(tailNumber, flightNumber, flightRepository.findAll());
    }

}
