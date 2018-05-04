package com.ioet.bpm.catalogue.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
}
