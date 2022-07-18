package com.rommel.Immfly.models;

import java.io.Serializable;

/**
  * 
  *Class that handle all information related to an airport, it could be instantiated as an Destination airport or Origin airport
  * 
  */
public class Airport implements Serializable{
    private String code;
    private String city;
    private String alternateIdent;
    private String airportName;

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the alternateIdent
     */
    public String getAlternateIdent() {
        return alternateIdent;
    }

    /**
     * @param alternateIdent the alternateIdent to set
     */
    public void setAlternateIdent(String alternateIdent) {
        this.alternateIdent = alternateIdent;
    }

    /**
     * @return String return the airportName
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * @param airportName the airportName to set
     */
    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

}