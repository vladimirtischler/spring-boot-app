package com.example.springbootapp.model;

public class Driver extends Job {
    public Driver(int bonus, float salary) {
        super(bonus, salary, JobType.DRIVER);
    }
}
