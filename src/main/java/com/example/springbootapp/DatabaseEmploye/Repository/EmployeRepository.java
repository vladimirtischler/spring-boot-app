package com.example.springbootapp.DatabaseEmploye.Repository;

import com.example.springbootapp.DatabaseEmploye.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Integer> {
}
