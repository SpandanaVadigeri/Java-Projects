# Employee Management System - Spring Boot Project

A Spring Boot-based application for managing employees with authentication support.  
The project provides two main modules:
1. **Employee Management** → CRUD operations on employee data
2. **User Authentication** → Login & Signup with token generation

✅ Server: Spring Boot (via Spring Initializer)  
✅ Routes: GET, POST, PUT, DELETE  
✅ Responses: JSON

---

## Technologies Used
- Java 17+
- Spring Boot, Spring Data JPA
- MySQL
- JWT Authentication
- Maven, Postman

---

## API Endpoints

### 🔹 User Authentication
Base URL: `http://localhost:8080`

- `POST    /register` – Register a new user
- `POST    /login` – Login and get JWT token

### 🔹 Employee Management
Base URL: `http://localhost:8080/employees`

- `GET     /employees` – Get all employees
- `GET     /employees/{empId}` – Get employee by ID
- `POST    /employees` – Add a new employee
- `PUT     /employees` – Update employee details
- `DELETE  /employees/{empId}` – Delete employee by ID

---

## Features
- User **registration & login** with token-based authentication
- Add, update, delete, and view employees
- Search employees by ID
- MySQL support with Spring Data JPA
- REST APIs with JSON responses
- Tested with Postman

---

## Notes
- Users must **login first** to get a JWT token before accessing secured endpoints
 
