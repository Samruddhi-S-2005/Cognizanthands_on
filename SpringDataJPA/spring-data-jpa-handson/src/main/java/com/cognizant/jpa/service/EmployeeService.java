package com.cognizant.jpa.service;

import com.cognizant.jpa.model.Employee;
import com.cognizant.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional(readOnly = true)
    public Employee get(int id) {
        return employeeRepository.getEmployee(id);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAllPermanentEmployees() {
        return employeeRepository.getAllPermanentEmployees();
    }

    @Transactional
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Transactional
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}