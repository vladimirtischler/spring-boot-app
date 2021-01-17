package com.example.springbootapp.Employe.model;

import javax.persistence.Entity;

@Entity
public class Teacher extends Employe {

    public Teacher(int bonus, float salary, EmployeType employeType, Long companyId){
        super(bonus,salary, employeType, companyId);
    }

    public Teacher() {
    }
}
