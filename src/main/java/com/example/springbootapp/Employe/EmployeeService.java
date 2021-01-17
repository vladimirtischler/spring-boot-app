package com.example.springbootapp.Employe;

import com.example.springbootapp.Employe.model.Employe;

import java.util.List;

public interface EmployeeService {
    double getTotalSalary(List<Employe> employes);
    int getTotalBonus(List<Employe> employes);
    int writeNumber();
}
