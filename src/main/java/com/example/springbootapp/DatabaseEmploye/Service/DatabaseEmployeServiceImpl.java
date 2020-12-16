package com.example.springbootapp.DatabaseEmploye.Service;

import com.example.springbootapp.DatabaseEmploye.Employe;
import com.example.springbootapp.DatabaseEmploye.Repository.EmployeRepository;
import org.springframework.stereotype.Service;

@Service
public class DatabaseEmployeServiceImpl implements DatabaseEmployeService{
    EmployeRepository employeRepository;

    public DatabaseEmployeServiceImpl(EmployeRepository employeRepository){
        this.employeRepository = employeRepository;
    }
    @Override
    public void saveEmploye(Employe employe) {
        employeRepository.save(employe);
    }
}
