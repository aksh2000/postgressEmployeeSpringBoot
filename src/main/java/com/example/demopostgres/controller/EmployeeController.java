package com.example.demopostgres.controller;
import com.example.demopostgres.entity.Employee;
import com.example.demopostgres.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/employee")
public class EmployeeController{

    @Autowired
    EmployeeService employeeService;


    @GetMapping(value = "/findAll")
    List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping(value = "/{employeeId}")
    Employee findById(@PathVariable("employeeId") int id){
        return employeeService.findById(id);
    }

    @PostMapping(value = "/add")
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @GetMapping(value = "/delete/{employeeId}")
    public String delete(@PathVariable("employeeId") int id){

            employeeService.deleteById(id);
            return "Succesfully Deleted";
    }
}
