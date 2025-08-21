package com.example.employeeMgt.controller;

import com.example.employeeMgt.model.Employee;
import com.example.employeeMgt.service.EmployeeService;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks this class as a REST controller (methods return JSON/XML data)
@CrossOrigin // Allows requests from different origins (CORS support)
@RequestMapping("/employees") // Base URL for all endpoints in this controller

public class EmployeeController {
    private final EmployeeService service; // Service layer dependency

    // Constructor-based dependency injection
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // GET /employees - Retrieve all employees
    @GetMapping
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> employees = service.getAllEmployees();
        return (employees.isEmpty())
                ? ResponseEntity.status(HttpStatus.OK).body("No employees found. Table is empty.")
                : ResponseEntity.ok(employees);
    }

    // GET /employees/{empId} - Retrieve an employee by ID
    @GetMapping("/{empId}")
    public ResponseEntity<?> getEmployeeById(@PathVariable int empId) {  // ? : Can return any datatype
        Employee employee = service.getEmployeeById(empId);

        return (employee != null)
                ? ResponseEntity.ok(employee) // Return 200 OK with employee data
                :ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Employee with ID " + empId + " not found.");  // 404 - not found
    }

    // POST /employees - Add a new employee
    @PostMapping
    public ResponseEntity<String>addEmployee(@RequestBody Employee emp){
        boolean isAdded = service.addEmployee(emp);

        return isAdded
            ?  ResponseEntity.ok("Employee added successfully")
            :  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR) // 500 - internal server error
                    .body("Failed to add employee.");
    }

    // PUT /employees - Update existing employee details
    @PutMapping
    public ResponseEntity <String> updateEmployee(@RequestBody Employee emp){

        if(!service.existsById(emp.getEmpId())){
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Employee with ID " + emp.getEmpId()+ " does not exist");
        }

        boolean isUpdated = service.updateEmployee(emp);
        return isUpdated
                ? ResponseEntity.ok("Employee updated successfully") // 200 OK
                : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Failed to update the employee due to a server error");
    }

    // DELETE /employees - delete employee by Id
    @DeleteMapping("/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int empId){

        if(!service.existsById(empId)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Employee with ID " + empId + " does not exist");
        }

        boolean isDeleted = service.deleteEmployee(empId);
        return isDeleted
                ? ResponseEntity.ok("Employee deleted successfully") // 200 OK
                : ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Failed to update the employee due to a server error");

    }
}
