package com.sandyhandle.webapp.departmentservice.client;

import com.sandyhandle.webapp.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employees/department/{id}")
    public List<Employee> findByDepartment(@PathVariable("id") Long id);
}
