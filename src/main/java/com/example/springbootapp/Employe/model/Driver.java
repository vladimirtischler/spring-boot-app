package com.example.springbootapp.Employe.model;

import javax.persistence.Entity;

@Entity
public class Driver extends Employe {
    public Driver(int bonus, float salary, EmployeType employeType, Long companyId) {
        super(bonus, salary, employeType, companyId);
    }

    public Driver() {
    }
}
