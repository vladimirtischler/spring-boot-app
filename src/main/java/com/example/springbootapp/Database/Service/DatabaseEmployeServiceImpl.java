package com.example.springbootapp.Database.Service;

import com.example.springbootapp.Database.Employe;
import com.example.springbootapp.Database.Repository.EmployeRepository;
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
