package com.example.springbootapp.DatabaseEmploye.Controller;

import com.example.springbootapp.DatabaseEmploye.Employe;
import com.example.springbootapp.DatabaseEmploye.Service.DatabaseEmployeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
    DatabaseEmployeService databaseEmployeService;

    public EmployeController(DatabaseEmployeService databaseEmployeService){
        this.databaseEmployeService = databaseEmployeService;
    }

    @PostMapping(value = "/employeDatabase")
    public void postEmploye(@RequestBody Employe employe){
        databaseEmployeService.saveEmploye(employe);
    }
}
