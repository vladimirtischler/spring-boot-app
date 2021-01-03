package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Driver extends Employe {
    public Driver(int id,int bonus, float salary) {
        super(id,bonus, salary, EmployeType.DRIVER);
    }

    public Driver() {
    }
}
