package com.rommel.Immfly.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Class that set the needed config to securize our API with Spring Security, is deprecated but necessary to our sample app.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    
    /** 
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure (HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .anyRequest()
            .authenticated()
            .and()
            .httpBasic();

        // We need to disable CSRF because it will need an extra token
        // To keep the app simple as possible, is better to disable it than implement it.
        // DO NOT DO this in production!!
        http.csrf().disable();
    }
    
}