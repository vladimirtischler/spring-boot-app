package com.example.springbootapp.Employe.model;

import com.example.springbootapp.Company.Company;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "employeType"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Driver.class, name = "Driver"),
        @JsonSubTypes.Type(value = Programmer.class, name = "Programmer"),
        @JsonSubTypes.Type(value = Teacher.class, name = "Teacher")
})

@Entity
@Table(name="Employes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employeType", discriminatorType = DiscriminatorType.STRING)
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    protected int bonus;

    protected float salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "employeType", nullable = false,insertable = false,updatable = false)
    protected EmployeType employeType;

    @JoinColumn(name = "company_id", insertable = false,updatable = false)
    @ManyToOne(targetEntity = Company.class,fetch = FetchType.EAGER)
    protected Company company;

    @Column(name="company_id")
    protected Long companyId;

    public Employe(){}

    public Employe(int bonus, float salary, EmployeType empployeType, Long companyId) {
         this.salary = salary;
         this.bonus = bonus;
         this.employeType = empployeType;
         this.companyId = companyId;
    }

    public String getInfo(){
        return employeType.value +"´s salary is "+salary+" and bonus is "+bonus+".";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public EmployeType getEmployeType() {
        return employeType;
    }

    public void setEmployeType(EmployeType employeType) {
        this.employeType = employeType;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
