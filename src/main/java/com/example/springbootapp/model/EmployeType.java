package com.example.springbootapp.model;



public enum EmployeType {
    PROGRAMMER("Programmer"),
    TEACHER("Teacher"),
    DRIVER("Driver");

    String value;

    EmployeType(String value){
        this.value = value;
    }

    public String getJobType(){
        return this.name();
    }
}