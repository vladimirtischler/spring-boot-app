package com.example.springbootapp.Employe.model;

import javax.persistence.Entity;

@Entity
public class Programmer extends Employe {
    public Programmer(int bonus, float salary, EmployeType employeType, Long companyId) {
        super(bonus, salary, employeType, companyId);
    }

    public Programmer() {
    }

    @Override
    public String getInfo(){
        return employeType.value +"´s salary is "+ (salary+bonus)+".";
    }
}
