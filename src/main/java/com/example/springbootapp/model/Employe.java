package com.example.springbootapp.model;

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

    public Employe(){}

    public Employe(int id,int bonus, float salary, EmployeType empployeType) {
         this.id = id;
         this.salary = salary;
         this.bonus = bonus;
         this.employeType = empployeType;
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
}
