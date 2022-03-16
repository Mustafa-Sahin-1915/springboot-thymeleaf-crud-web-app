package com.crud.springboot.service;

import com.crud.springboot.model.Employee;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
