package com.example.springbootapp.Database.Repository;

import com.example.springbootapp.Database.Employe;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Integer> {
}
