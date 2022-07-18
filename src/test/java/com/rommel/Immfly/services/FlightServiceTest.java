package com.rommel.Immfly.services;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import com.rommel.Immfly.models.Flight;


public class FlightServiceTest {

    private String flightsJsonPath = "src/main/resources/static/flights.json";
    private Map<String, Flight> flightsMap;
    FlightService flightService = new FlightService();

    @Test
    Map<String,Flight> generateMapFlightFromJson(String path) {
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader(path);
            Type type = new TypeToken<Map<String, Flight>>(){}.getType();
            Map<String, Flight> map = gson.fromJson(reader, type);
            return map;
        }
        catch (IOException exception) {
            System.out.println(exception.getMessage());
            return null;
        }    
    }
    
    @Test
    void testGetFlighstByTailNumber() {
        flightsMap = flightService.getFlightsByTailNumber("EC-ABC", generateMapFlightFromJson(flightsJsonPath));
        Assert.assertEquals(2, flightsMap.size());
        Flight flight = flightsMap.get("test2");
        Assert.assertEquals("IBB", flight.getAirline());
        Assert.assertEquals("Tenerife", flight.getOrigin().getCity());
    }

    @Test
    void testGetFlightByTailNumberAndFlightNumber() {
        Flight flight = flightService.getFlightByTailNumberAndFlightNumber("EC-ABC", "111", generateMapFlightFromJson(flightsJsonPath));
        Assert.assertNotNull(flight);
        Assert.assertEquals("IBB", flight.getAirline());
        Assert.assertEquals("Tenerife", flight.getOrigin().getCity());
    }
}
