package com.dharbor.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class EmployeeInformation {


 	private String name; 




    public String getName(){
        return this.name;
    }
 
	public void setName(String name){
        this.name = name;
    }
 

}