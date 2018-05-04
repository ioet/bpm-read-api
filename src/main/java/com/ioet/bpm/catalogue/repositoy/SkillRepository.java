package com.ioet.bpm.catalogue.repositoy;

import com.ioet.bpm.catalogue.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
