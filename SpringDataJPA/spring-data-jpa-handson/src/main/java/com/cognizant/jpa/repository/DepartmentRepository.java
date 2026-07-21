package com.cognizant.jpa.repository;

import com.cognizant.jpa.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("""
            SELECT DISTINCT d
            FROM Department d
            LEFT JOIN FETCH d.employeeList
            WHERE d.id = :id
            """)
    Department getDepartment(@Param("id") int id);

    @Query("""
            SELECT AVG(e.salary)
            FROM Employee e
            WHERE e.department.id = :id
            """)
    Double getAverageSalary(@Param("id") int id);
}