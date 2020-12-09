package com.example.springbootapp.Company.Controller;

import com.example.springbootapp.Company.Company;
import com.example.springbootapp.Company.Sevice.CompanyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @GetMapping(value = "/company")
    public void getCompany(){
        Company company = new Company();
        companyService.saveCompany(company);
    }
}
