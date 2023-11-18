
package com.airlines.entity;

import jakarta.servlet.http.Part;
import java.io.FileInputStream;
import java.io.InputStream;


public class Passengers {

    private String pname,contact,email,gender,source,destination,travel_class,travelDate;
    private Part pic;
    private int  age,passport,flight_no;

    public Passengers() {
    }
    
    public Passengers(String pname, String contact, String email, String gender, String source, String destination, String travel_class, String travelDate,Part pic, int age, int passport, int flight_no) {
        this.pname = pname;
        this.contact = contact;
        this.email = email;
        this.gender = gender;
        this.source = source;
        this.destination = destination;
        this.travel_class = travel_class;
        this.travelDate = travelDate;
        this.pic = pic;
        this.age = age;
        this.passport = passport;
        this.flight_no = flight_no;
        
    }
    

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTravel_class() {
        return travel_class;
    }

    public void setTravel_class(String travel_class) {
        this.travel_class = travel_class;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public Part getPic() {
        return pic;
    }

    public void setPic(Part pic) {
        this.pic = pic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(int flight_no) {
        this.flight_no = flight_no;
    }
   
}
   
   

   

    