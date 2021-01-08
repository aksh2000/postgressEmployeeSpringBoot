package com.example.demopostgres.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "employee")   // class belongs to a table called employee
public class Employee {

    // declare ID as primary key
    @Id
    private int id;

    //member names = column names

    private String firstName;
    private String lastName;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dateofBirth;
    private double salary;
    private double experience;

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public double getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
