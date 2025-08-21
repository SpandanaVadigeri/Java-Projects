package com.example.employeeMgt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity // Indicates this class is mapped to a database table
@Data   // Lombok annotation to auto-generate boilerplate code (getters/setters etc.)
@AllArgsConstructor // Lombok annotation to generate constructor with all fields
@NoArgsConstructor  // Lombok annotation to generate a no-arg constructor
public class Employee {

    @Id // Specifies the primary key of the entity
    private int empId;
    private String empName;
    private String department;
    private String designation;
    private LocalDate dob;
    private String email;
    private String phone;
    private LocalDate joinDate;
    private double salary;


}
