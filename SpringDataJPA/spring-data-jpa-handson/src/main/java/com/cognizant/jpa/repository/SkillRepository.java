package com.cognizant.jpa.repository;

import com.cognizant.jpa.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

    @Query("""
            SELECT DISTINCT s
            FROM Skill s
            LEFT JOIN FETCH s.employeeList
            WHERE s.id = :id
            """)
    Skill getSkill(@Param("id") int id);

}