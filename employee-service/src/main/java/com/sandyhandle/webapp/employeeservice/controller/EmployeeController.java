package com.sandyhandle.webapp.employeeservice.controller;

import com.sandyhandle.webapp.employeeservice.model.Employee;
import com.sandyhandle.webapp.employeeservice.repository.EmployeeRepository;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Log4j2
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        log.info("Employee add: {}",employee);
        return repository.add(employee);
    }

    @GetMapping
    public List<Employee> findAll(){
        log.info("Employee finding");
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        log.info("Employee find:  {}", id);
        return repository.findById(id);
    }


    @GetMapping("/department/{id}")
    public List<Employee> findByDepartment(@PathVariable("id") Long id){
        log.info("Finding Employee for department id: {}", id);
        return repository.findByDepartment(id);
    }
}
