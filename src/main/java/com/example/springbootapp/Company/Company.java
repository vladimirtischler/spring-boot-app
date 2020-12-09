package com.example.springbootapp.Company;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "Company")
    @NotNull
    Address address;
}
