package com.example.springbootapp.Company.Sevice;

import com.example.springbootapp.Company.Company;
import com.example.springbootapp.Company.Repository.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }
}
