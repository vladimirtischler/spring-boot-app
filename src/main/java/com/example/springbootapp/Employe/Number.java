package com.example.springbootapp.Employe;

import org.springframework.stereotype.Component;

@Component
public class Number {

    public Number(EmployeeService employeService){
        System.out.println(employeService.writeNumber());
    }
}
