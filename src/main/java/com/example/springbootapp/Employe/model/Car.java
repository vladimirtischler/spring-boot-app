package com.example.springbootapp.Employe.model;

import com.example.springbootapp.Employe.model.Employe;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String symbol;

    private int yearOfProduction;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Employe> employes;


    public Car(int yearOfProduction, String symbol) {
        this.yearOfProduction = yearOfProduction;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
