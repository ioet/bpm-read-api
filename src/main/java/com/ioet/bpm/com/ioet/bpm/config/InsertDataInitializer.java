package com.ioet.bpm.com.ioet.bpm.config;

import com.ioet.bpm.catalogue.domain.Employee;
import com.ioet.bpm.catalogue.domain.Project;
import com.ioet.bpm.catalogue.domain.Skill;
import com.ioet.bpm.catalogue.repositoy.EmployeeRepository;
import com.ioet.bpm.catalogue.repositoy.ProjectRepository;
import com.ioet.bpm.catalogue.repositoy.SkillRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InsertDataInitializer implements ApplicationListener<ApplicationReadyEvent> {


    private final EmployeeRepository employeeRepository;
    private  final ProjectRepository projectRepository;
    private  final SkillRepository skillRepository;

    public InsertDataInitializer(EmployeeRepository employeeRepository, ProjectRepository projectRepository, SkillRepository skillRepository) {
        this.employeeRepository = employeeRepository;
        this.projectRepository = projectRepository;
        this.skillRepository = skillRepository;
    }

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        Employee employeeRene = new Employee();
        employeeRene.setName("Rene");
        employeeRene.setLastName("Enriquez");

        Employee employeeIvan = new Employee();
        employeeIvan.setName("Ivan");
        employeeIvan.setLastName("Zamora");


        Project projectBPM = new Project();
        projectBPM.setName("BPM");

        Project projectGH = new Project();
        projectGH.setName("GH Care");


        Skill java = new Skill();
        java.setName("Java");

        Skill react = new Skill();
        react.setName("React JS");

        Skill devOps = new Skill();
        devOps.setName("DevOps");

        Skill noSqlDbs = new Skill();
        noSqlDbs.setName("NoSQL Databases");

        Skill splunk = new Skill();
        splunk.setName("Splunk");

        Skill [] skills = new Skill[]{java, react, devOps, noSqlDbs, splunk};

        skillRepository.saveAll(Arrays.asList(skills));

        projectRepository.save(projectBPM);
        projectRepository.save(projectGH);

        employeeRepository.save(employeeRene);
        employeeRepository.save(employeeIvan);
    }
}
