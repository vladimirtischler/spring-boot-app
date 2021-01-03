package com.example.springbootapp;

import com.example.springbootapp.Employe.EmployeeService;
import com.example.springbootapp.model.Driver;
import com.example.springbootapp.model.Employe;
import com.example.springbootapp.model.Programmer;
import com.example.springbootapp.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo{
    EmployeeService employeService;
    List<Employe> employes = Arrays.asList(new Programmer(0,300,2500),new Driver(0,250,1800),new Teacher(0,150,1000));

    public String getSum(List<Employe> employes)
    {
        return employeService.getTotalBonus(employes)+" "+employeService.getTotalSalary(employes);
    }

    public DependencyInjectionDemo(EmployeeService employeService){
        this.employeService = employeService;
        System.out.println(getSum(employes));
        System.out.println(employeService.writeNumber());

    }

}
