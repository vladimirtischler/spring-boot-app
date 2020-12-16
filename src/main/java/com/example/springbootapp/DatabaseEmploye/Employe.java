package com.example.springbootapp.DatabaseEmploye;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String employeName;

    private String kindWork;

    public Employe(int id, String employeName, String kindWork){
        this.employeName = employeName;
        this.id = id;
        this.kindWork = kindWork;
    }

    public int getId(){
        return id;
    }

    public String getEmployeName(){
        return employeName;
    }

    public String getKindWork(){
        return kindWork;
    }

}
