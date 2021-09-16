package com.Hackathon.hackathonteam14.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

//Maps to the table named locations in DB
//@Entity(name = "locations")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long location_id;

    private String location_street;
    private String location_city;
    private String location_state;
    private int access_rating;


    private List<Location>locations;

    public Location(){
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Long getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Long location_id) {
        this.location_id = location_id;
    }

    public String getLocation_street() {
        return location_street;
    }

    public void setLocation_street(String location_street) {
        this.location_street = location_street;
    }

    public String getLocation_city() {
        return location_city;
    }

    public void setLocation_city(String location_city) {
        this.location_city = location_city;
    }

    public String getLocation_state() {
        return location_state;
    }

    public void setLocation_state(String location_state) {
        this.location_state = location_state;
    }

    public int getAccess_rating() {
        return access_rating;
    }

    public void setAccess_rating(int access_rating) {
        this.access_rating = access_rating;
    }
}
