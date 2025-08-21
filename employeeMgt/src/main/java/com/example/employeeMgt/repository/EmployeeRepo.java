package com.example.employeeMgt.repository;

import com.example.employeeMgt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Tells Spring to treat this as a Repository (data access layer)
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    // Spring Data JPA automatically
    // provides methods like save(), findById(), findAll(), deleteById(), existsById(), etc.
}
