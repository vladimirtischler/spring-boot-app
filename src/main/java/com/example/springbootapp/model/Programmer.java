package com.example.springbootapp.model;

import javax.persistence.Entity;

@Entity
public class Programmer extends Employe {
    public Programmer(int id, int bonus, float salary ) {
        super(id, bonus, salary, EmployeType.PROGRAMMER);
    }

    public Programmer() {
    }

    @Override
    public String getInfo(){
        return employeType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
