package com.ioet.bpm.catalogue.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue
    private int id;
    private String name;
}
