package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Programmer extends Employe {
    public Programmer(int id, int bonus, float salary, EmployeType employeType ) {
        super(id, bonus, salary, employeType);
    }

    public Programmer() {
    }

    @Override
    public String getInfo(){
        return employeType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
