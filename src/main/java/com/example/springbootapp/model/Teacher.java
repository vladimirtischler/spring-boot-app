package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Teacher extends Employe {

    public Teacher(int id, int bonus, float salary){
        super(id, bonus,salary, EmployeType.TEACHER);
    }

    public Teacher() {
    }
}
