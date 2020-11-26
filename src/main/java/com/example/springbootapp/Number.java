package com.example.springbootapp;

import org.springframework.stereotype.Component;

@Component
public class Number {

    public Number(EmployeService employeService){
        System.out.println(employeService.writeNumber());
    }
}
