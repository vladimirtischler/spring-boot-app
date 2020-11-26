package com.example.springbootapp;

import com.example.springbootapp.model.Driver;
import com.example.springbootapp.model.Job;
import com.example.springbootapp.model.Programmer;
import com.example.springbootapp.model.Teacher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DependencyInjectionDemo{
    EmployeeServiceImpl employeService;
    List<Job> jobs = Arrays.asList(new Programmer(300,2500),new Driver(250,1800),new Teacher(150,1000));

    public String getSum(List<Job> jobs)
    {
        return employeService.getTotalBonus(jobs)+" "+employeService.getTotalSalary(jobs);
    }

    public DependencyInjectionDemo(EmployeeServiceImpl employeeService){
        this.employeService = employeeService;
        System.out.println(getSum(jobs));
        System.out.println(employeeService.writeNumber());
        System.out.println(employeeService.writeNumber());
    }

}
