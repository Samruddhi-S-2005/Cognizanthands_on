package com.cognizant.jpa.repository;

import com.cognizant.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("""
            SELECT DISTINCT e
            FROM Employee e
            LEFT JOIN FETCH e.department
            LEFT JOIN FETCH e.skillList
            WHERE e.id = :id
            """)
    Employee getEmployee(@Param("id") int id);

}