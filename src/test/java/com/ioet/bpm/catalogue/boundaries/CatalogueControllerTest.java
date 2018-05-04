package com.ioet.bpm.catalogue.boundaries;


import com.ioet.bpm.catalogue.repositoy.EmployeeRepository;
import com.ioet.bpm.catalogue.repositoy.ProjectRepository;
import com.ioet.bpm.catalogue.repositoy.SkillRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CatalogueControllerTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private ProjectRepository projectRepository;

    @Mock
    private SkillRepository skillRepository;

    @InjectMocks
    private CatalogueController controller;

    @Test
    public void whenEmployeesAreRequestedThenRepositoryIsUsed() throws Exception {

        controller.getEmployees();

        verify(employeeRepository, times(1)).findAll();
    }

    @Test
    public void theResponseHasAnStatusOK() throws Exception {

        ResponseEntity employeesResponse = controller.getEmployees();

        Assert.assertEquals(HttpStatus.OK, employeesResponse.getStatusCode());

    }

    @Test
    public void projectsResponseHasOKstatus() throws Exception {

        ResponseEntity projectResponse = controller.getProjects();

        Assert.assertEquals(HttpStatus.OK, projectResponse.getStatusCode());
    }

    @Test
    public void skillsResponseHasOKstatus() throws Exception {

        ResponseEntity projectResponse = controller.getSkills();

        Assert.assertEquals(HttpStatus.OK, projectResponse.getStatusCode());
    }
}
