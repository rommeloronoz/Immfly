package com.rommel.Immfly.repositories;

import java.util.Map;
import java.util.UUID;
import javax.annotation.PostConstruct;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.rommel.Immfly.models.Flight;

/**
 * Class that handles all the queries to the Redis ddbb
 */
@Repository
public class FlightRepository implements RedisRepository {

    private static final String KEY = "IMMFLY";
    private RedisTemplate<String, Flight> redisTemplate;
    private HashOperations hashOperations;
    
    /**
     * Public constructor
     * @param redisTemplate model that uses the mapper to serialize and de-serialize the objects
     */
    public FlightRepository(RedisTemplate<String, Flight> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }
    
    
    /** 
     * @return Map<String, Flight>
     */
    @Override
    public Map<String, Flight> findAll() {
        return hashOperations.entries(KEY);
    }
    
}
