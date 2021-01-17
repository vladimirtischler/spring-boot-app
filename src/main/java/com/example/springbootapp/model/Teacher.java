package com.example.springbootapp.model;

import com.example.springbootapp.Company.Company;

import javax.persistence.Entity;

@Entity
public class Teacher extends Employe {

    public Teacher(int bonus, float salary, EmployeType employeType, Long companyId){
        super(bonus,salary, employeType, companyId);
    }

    public Teacher() {
    }
}
