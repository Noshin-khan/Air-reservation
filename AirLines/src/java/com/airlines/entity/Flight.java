
package com.airlines.entity;


import java.sql.Time;


public class Flight {
     private int flight_no;
   private Time arrival_time,destination_time;
   private String arrival_stop,destination_stop;

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }

    public void setArrival_time(Time arrival_time) {
        this.arrival_time = arrival_time;
    }

    public void setDestination_time(Time destination_time) {
        this.destination_time = destination_time;
    }

    public void setArrival_stop(String arrival_stop) {
        this.arrival_stop = arrival_stop;
    }

    public void setDestination_stop(String destination_stop) {
        this.destination_stop = destination_stop;
    }

    public int getFlight_no() {
        return flight_no;
    }

    public Time getArrival_time() {
        return arrival_time;
    }

    public Time getDestination_time() {
        return destination_time;
    }

    public String getArrival_stop() {
        return arrival_stop;
    }

    public String getDestination_stop() {
        return destination_stop;
    }
}
