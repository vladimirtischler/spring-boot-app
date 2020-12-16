package com.example.springbootapp.Company;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    Address address;

    public Company(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
