package com.cognizant.jpa.service;

import com.cognizant.jpa.model.Skill;
import com.cognizant.jpa.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;

    @Transactional(readOnly = true)
    public Skill get(int id) {
        return skillRepository.getSkill(id);
    }
}