package com.ioet.bpm.catalogue.repositoy;

import com.ioet.bpm.catalogue.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
