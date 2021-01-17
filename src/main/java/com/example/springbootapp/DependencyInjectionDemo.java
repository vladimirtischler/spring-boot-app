package com.example.springbootapp;

import com.example.springbootapp.Employe.EmployeeService;
import com.example.springbootapp.Employe.model.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DependencyInjectionDemo{
    EmployeeService employeService;
    //List<Employe> employes = Arrays.asList(new Programmer(0,300,2500, EmployeType.PROGRAMMER),new Driver(0,250,1800, EmployeType.DRIVER,null),new Teacher(0,150,1000, EmployeType.TEACHER));

    public String getSum(List<Employe> employes)
    {
        return employeService.getTotalBonus(employes)+" "+employeService.getTotalSalary(employes);
    }

    public DependencyInjectionDemo(EmployeeService employeService){
        this.employeService = employeService;
        //System.out.println(getSum(employes));
        System.out.println(employeService.writeNumber());

    }

}
