package com.example.springbootapp.Employe.Service;

import com.example.springbootapp.model.Job;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    int number = 0;
    @Override
    public int writeNumber(){
       return number+=1;
    }

    @Override
    public double getTotalSalary(List<Job>jobs) {
       return jobs.stream().mapToDouble(Job::getSalary).sum();
    }

    @Override
    public int getTotalBonus(List<Job>jobs) {
        return jobs.stream().mapToInt(Job::getBonus).sum();
    }
}
