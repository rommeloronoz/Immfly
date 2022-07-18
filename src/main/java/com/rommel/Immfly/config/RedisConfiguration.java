package com.rommel.Immfly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.rommel.Immfly.models.Flight;

/**
 * Class that handles all the config needed to access our Redis ddbb
 */
@Configuration
public class RedisConfiguration {
    
    /**
     * @return JedisConnectionFactory that will manage the connection with the ddbb
     */
    @Bean
     JedisConnectionFactory jedisConnectionFactory () {
         return new JedisConnectionFactory();
    }
    
    /**
     * @return RedisTemplate<String, Flight> it will refactor the response into an map with our custom class Flight
     */
    @Bean
    RedisTemplate<String, Flight> redisTemplate() {
        RedisTemplate<String, Flight> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate; 
    }
}
