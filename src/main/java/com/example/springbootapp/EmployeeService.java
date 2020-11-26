package com.example.springbootapp;

import com.example.springbootapp.model.Job;

import java.util.List;

interface EmployeService {
    double getTotalSalary(List<Job> jobs);
    int getTotalBonus(List<Job> jobs);
    int writeNumber();
}
