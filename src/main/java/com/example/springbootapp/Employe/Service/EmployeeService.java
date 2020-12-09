package com.example.springbootapp.Employe.Service;

import com.example.springbootapp.model.Job;

import java.util.List;

public interface EmployeeService {
    double getTotalSalary(List<Job> jobs);
    int getTotalBonus(List<Job> jobs);
    int writeNumber();
}
