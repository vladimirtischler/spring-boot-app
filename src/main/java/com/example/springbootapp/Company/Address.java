package com.example.springbootapp.Company;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private int zipCode;

    private String city;

    private String state;

    public Address(Long id, String street, int zipCode, String city, String state){
        this.id = id;
        this.city = city;
        this.state = state;
        this.street = street;
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    public Long id() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
