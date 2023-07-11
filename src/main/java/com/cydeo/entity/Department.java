package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department extends BaseEntity{
    private String department;
    private String region;

    public Department(String department, String region) {
        this.department = department;
        this.region = region;
    }
}
