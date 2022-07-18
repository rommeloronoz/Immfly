package com.rommel.Immfly.models;

import java.io.Serializable;

/**
 * Class that handle all information related to a flight.
 */
public class Flight implements Serializable {
    
    private String ident;
    private String faFlightID;
    private String airline;
    private String airlineIata;
    private String flightNumber;
    private String tailNumber;
    private String type;
    private String codeShares;
    private boolean blocked;
    private boolean diverted; 
    private boolean cancelled;   
    private Airport origin;
    private Airport destination;
    
    /**
     * @return String return the ident
     */
    public String getIdent() {
        return ident;
    }

    /**
     * @param ident the ident to set
     */
    public void setIdent(String ident) {
        this.ident = ident;
    }

    /**
     * @return String return the faFlightID
     */
    public String getFaFlightID() {
        return faFlightID;
    }

    /**
     * @param faFlightID the faFlightID to set
     */
    public void setFaFlightID(String faFlightID) {
        this.faFlightID = faFlightID;
    }

    /**
     * @return String return the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * @param ident the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * @return String return the airlineIata
     */
    public String getAirlineIata() {
        return airlineIata;
    }

    /**
     * @param airlineIata the airlineIata to set
     */
    public void setAirlineIata(String airlineIata) {
        this.airlineIata = airlineIata;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return String return the codeShares
     */
    public String getCodeShares() {
        return codeShares;
    }

    /**
     * @param codeShares the codeShares to set
     */
    public void setCodeShares(String codeShares) {
        this.codeShares = codeShares;
    }

    /**
     * @return boolean return the blocked
     */
    public boolean isBlocked() {
        return blocked;
    }

    /**
     * @param blocked the blocked to set
     */
    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    /**
     * @return boolean return the diverted
     */
    public boolean isDiverted() {
        return diverted;
    }

    /**
     * @param diverted the diverted to set
     */
    public void setDiverted(boolean diverted) {
        this.diverted = diverted;
    }

    /**
     * @return boolean return the cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
    
    /**
     * @return String return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return String return the tailNumber
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * @param tailNumber the tailNumber to set
     */
    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    /**
     * @return Airport return the origin
     */
    public Airport getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(Airport origin) {
        this.origin = origin;
    }

    /**
     * @return Airport return the destination
     */
    public Airport getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(Airport destination) {
        this.destination = destination;
    }

}
