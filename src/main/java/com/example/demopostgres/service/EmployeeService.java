package com.example.demopostgres.service;

import com.example.demopostgres.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    Employee findById(int id);

    void deleteById(int id);

    List<Employee> findAll();
}
