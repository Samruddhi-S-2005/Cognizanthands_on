package com.cognizant.jpa.service;

import com.cognizant.jpa.model.Department;
import com.cognizant.jpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional(readOnly = true)
    public Department get(int id) {
        return departmentRepository.getDepartment(id);
    }

    @Transactional(readOnly = true)
    public Double getAverageSalary(int departmentId) {
        return departmentRepository.getAverageSalary(departmentId);
    }
}