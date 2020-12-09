package com.example.springbootapp.Company;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long company_id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "company_id")
    private Company company;

    private String street;

    private int zipCode;

    private String city;

    private String state;

}
