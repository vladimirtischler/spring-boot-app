package com.example.springbootapp.DatabaseEmploye;

import com.example.springbootapp.model.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Integer> {
}
