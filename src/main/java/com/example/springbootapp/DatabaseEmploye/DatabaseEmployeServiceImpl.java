package com.example.springbootapp.DatabaseEmploye;

import com.example.springbootapp.Employe.model.Employe;
import org.springframework.stereotype.Service;

@Service
public class DatabaseEmployeServiceImpl implements DatabaseEmployeService {
    EmployeRepository employeRepository;

    public DatabaseEmployeServiceImpl(EmployeRepository employeRepository){
        this.employeRepository = employeRepository;
    }
    @Override
    public void saveEmploye(Employe employe) {
        employeRepository.save(employe);
    }
}
