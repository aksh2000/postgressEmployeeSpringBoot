package com.example.demopostgres.service.implementations;

import com.example.demopostgres.entity.Employee;
import com.example.demopostgres.repository.EmployeeRepository;
import com.example.demopostgres.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class EmployeeServiceImplementation implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Transactional(readOnly = false)
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
            employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {

        Iterable<Employee> employeeIterable = employeeRepository.findAll();
        List<Employee> employeeList = new ArrayList<>();
        employeeIterable.forEach(employeeList::add);
        return employeeList;
    }
}
