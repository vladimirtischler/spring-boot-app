package com.example.springbootapp.model;

public class Teacher extends Job {

    public Teacher(int bonus, float salary){
        super(bonus,salary,JobType.TEACHER);
    }
}
