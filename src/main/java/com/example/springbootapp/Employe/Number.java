package com.example.springbootapp.Employe;

import com.example.springbootapp.Employe.Service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class Number {

    public Number(EmployeeService employeService){
        System.out.println(employeService.writeNumber());
    }
}
