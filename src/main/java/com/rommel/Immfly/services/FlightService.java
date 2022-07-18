package com.rommel.Immfly.services;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.rommel.Immfly.models.Flight;
import java.util.Map.Entry;

/**
 * Class that handles the response from the Redis ddbb and filtes it programatically
 */
@Service
public class FlightService {
    
    private Map<String, Flight> filteredMap = new HashMap<>();;
    private Flight flight;

    /**
     * 
     * Method that extracts from a map of Flights the ones that have the tailNumber
     * @param tailNumber 
     * @param map with all the Flights before being filtered 
     * @return Map<String, Flight> filteredMap with only flights with that tailNumber 
     */
    public Map<String, Flight> getFlightsByTailNumber(String tailNumber, Map<String, Flight> map) {
        for (Entry<String, Flight> entry : map.entrySet()) {
            flight = entry.getValue();
            if (flight.getTailNumber().equals(tailNumber)){
                filteredMap.put(entry.getKey(), entry.getValue());   
            }
        }
        return filteredMap;
    }


    /**
     * 
     * Method that returns a Flight that match with the tailNumber and flightNumber
     * @param tailNumber
     * @param flightNumber
     * @param map with all the Flights before being filtered
     * @return Flight flight in case found, if not, can return null
     */
    public Flight getFlightByTailNumberAndFlightNumber(String tailNumber, String flightNumber, Map<String, Flight> map) {
        for (Entry<String, Flight> entry : map.entrySet()) {
            flight = entry.getValue();
            if (flight.getTailNumber().equals(tailNumber) && flight.getFlightNumber().equals(flightNumber)){
                return flight;   
            }
        }    
        return null;
    }

}
