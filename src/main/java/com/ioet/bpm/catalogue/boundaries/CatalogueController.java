package com.ioet.bpm.catalogue.boundaries;


import com.ioet.bpm.catalogue.domain.Employee;
import com.ioet.bpm.catalogue.domain.Project;
import com.ioet.bpm.catalogue.domain.Skill;
import com.ioet.bpm.catalogue.repositoy.EmployeeRepository;
import com.ioet.bpm.catalogue.repositoy.ProjectRepository;
import com.ioet.bpm.catalogue.repositoy.SkillRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CatalogueController {

    private final EmployeeRepository employeeRepository;
    private final ProjectRepository projectRepository;
    private final SkillRepository skillRepository;


    public CatalogueController(EmployeeRepository employeeRepository, ProjectRepository projectRepository, SkillRepository skillRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
        this.skillRepository = skillRepository;
    }

    @GetMapping("/employees")
    public ResponseEntity getEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return new ResponseEntity(employees, HttpStatus.OK);
    }

    @GetMapping("/projects")
    public ResponseEntity getProjects() {
        List<Project> projects = projectRepository.findAll();
        return new ResponseEntity(projects, HttpStatus.OK);
    }

    @GetMapping("/skills")
    public ResponseEntity getSkills() {
        List<Skill> projects = skillRepository.findAll();
        return new ResponseEntity(projects, HttpStatus.OK);
    }

}
