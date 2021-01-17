package com.example.springbootapp.model;

import com.example.springbootapp.Company.Company;

import javax.persistence.Entity;

@Entity
public class Driver extends Employe {
    public Driver(int bonus, float salary, EmployeType employeType, Long companyId) {
        super(bonus, salary, employeType, companyId);
    }

    public Driver() {
    }
}
