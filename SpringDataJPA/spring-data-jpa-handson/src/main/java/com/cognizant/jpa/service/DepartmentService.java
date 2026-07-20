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

    @Transactional
    public Department get(int id) {
        Department department = departmentRepository.findById(id).orElse(null);

        if (department != null) {
            department.getEmployeeList().size();   // Initialize the collection
        }

        return department;
    }

    @Transactional
    public void save(Department department) {
        departmentRepository.save(department);
    }


}