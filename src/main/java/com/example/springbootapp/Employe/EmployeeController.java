package com.example.springbootapp.Employe;

import com.example.springbootapp.model.Driver;
import com.example.springbootapp.model.Employe;
import com.example.springbootapp.model.Programmer;
import com.example.springbootapp.model.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService employeService;
    List<Employe> employes = Arrays.asList(new Programmer(0,300,2500),new Driver(0,250,1800),new Teacher(0,150,1000));

    public EmployeeController(EmployeeService employeService){
        this.employeService = employeService;
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return " Hello Spring Boot";
    }

    @GetMapping(value = "/bonus")
    public int totalBonus(){
        return employeService.getTotalBonus(employes);
    }

    @GetMapping(value = "/salary")
    public double totalSalary(){
        return employeService.getTotalSalary(employes);
    }

    @GetMapping(value = "/snail")
    public double snail(@RequestParam double height, @RequestParam double lenght, @RequestParam double towerHeight){
        return towerHeight/height*(height+lenght);
    }
}
