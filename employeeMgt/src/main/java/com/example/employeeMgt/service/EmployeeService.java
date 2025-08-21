package com.example.employeeMgt.service;

import com.example.employeeMgt.model.Employee;
import com.example.employeeMgt.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indicates this class is a service layer component in Spring
public class EmployeeService {

    @Autowired
    private EmployeeRepo repo; // Repository for database operations

    // Fetch all employees from the database.
    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }

    // Fetch an employee by their ID.
    public Employee getEmployeeById(int empId) {
        return repo.findById(empId).orElse(null);
    }

    // Add a new employee to the database.
    public boolean addEmployee(Employee emp) {
        Employee addedEmployee = repo.save(emp);
        return addedEmployee.getEmpId() != 0;
    }

    // Update an existing employee in the database.
    public boolean updateEmployee(Employee emp) {
        if(repo.existsById(emp.getEmpId())){
            repo.save(emp);
            return true;
        }
        return false;
    }

    // Delete an employee by their ID.
    public boolean deleteEmployee(int empId) {
        if(repo.existsById(empId)){
            repo.deleteById(empId);
            return true;
        }
        return false;
    }

    public boolean existsById(int empId) {
        return repo.existsById(empId);
    }
}
