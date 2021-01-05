package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Teacher extends Employe {

    public Teacher(int id, int bonus, float salary, EmployeType employeType){
        super(id, bonus,salary, employeType);
    }

    public Teacher() {
    }
}
