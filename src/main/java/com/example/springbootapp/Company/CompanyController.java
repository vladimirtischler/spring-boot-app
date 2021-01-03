package com.example.springbootapp.Company;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    CompanyService companyService;

    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @PostMapping(value = "/postCompany")
    public void postCompany(@RequestBody Company company){
        companyService.saveCompany(company);
    }
}
