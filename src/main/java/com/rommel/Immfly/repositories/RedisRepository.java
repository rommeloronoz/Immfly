package com.rommel.Immfly.repositories;

import java.util.Map;

import com.rommel.Immfly.models.Flight;

/**
 * Interface that declare the methods to interact with the Redis ddbb
 */
public interface RedisRepository {
    /**
     * 
     * @return Map<String, Flight> with all Flights from the ddbb to be later processed and filtered programatically
     */
    Map<String, Flight> findAll();
    
}
