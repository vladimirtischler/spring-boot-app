package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Driver extends Employe {
    public Driver(int id,int bonus, float salary, EmployeType employeType) {
        super(id,bonus, salary, employeType);
    }

    public Driver() {
    }
}
