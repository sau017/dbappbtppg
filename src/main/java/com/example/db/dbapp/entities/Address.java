package com.example.db.dbapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address {
    
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2" , strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false , name = "ID")
    private String addressId;
    @Column(nullable = false , name = "Street")
    private String street;
    @Column(nullable = false , name = "CITY")
    private String city;
    @Column(nullable = false , name = "STATE")
    private String state;
    @Column(nullable = false , name = "REGION")
    private String region;

    public Address (){
        
    }
    
    public Address(String addressId, String street, String city, String state, String region) {
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.region = region;
    }
    public String getAddressId() {
        return addressId;
    }
    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }


    
}
