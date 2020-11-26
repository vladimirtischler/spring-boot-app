package com.example.springbootapp.model;

public class Job {
    protected int bonus;
    protected float salary;
    protected JobType jobType;

    public Job(int bonus, float salary, JobType jobType) {
         this.salary = salary;
         this.bonus = bonus;
         this.jobType = jobType;
    }

    public String getInfo(){
        return jobType.value +"´s salary is "+salary+" and bonus is "+bonus+".";
    }

    public int getBonus() {
        return bonus;
    }

    public float getSalary() {
        return salary;
    }
}
