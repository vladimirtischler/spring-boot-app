package com.example.springbootapp.Employe;

import com.example.springbootapp.Employe.model.Employe;
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
    public double getTotalSalary(List<Employe> employes) {
       return employes.stream().mapToDouble(Employe::getSalary).sum();
    }

    @Override
    public int getTotalBonus(List<Employe> employes) {
        return employes.stream().mapToInt(Employe::getBonus).sum();
    }
}
