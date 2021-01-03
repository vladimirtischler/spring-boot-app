package com.example.springbootapp.Company;

import com.example.springbootapp.Company.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Long> {

}
