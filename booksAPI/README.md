## BOOKS API - Spring Boot Project

This is a simple Books REST API project built using Spring Boot.  
The API allows users to Create, Read, Update, and Delete (CRUD) books data.

✅ Server: Spring Boot (via Spring Initializer)  
✅ Routes: GET, POST, PUT, DELETE  
✅ Responses: JSON

## Technologies used
- Java 17+
- Spring Boot
- Spring Web
- Maven

## API Endpoints
Base URL: `http://localhost:8080/books`

- `GET     /books` – Get all books
- `GET     /books/{id}` – Get book by ID
- `POST    /books` – Add a new book
- `PUT     /books/{id}` – Update book by ID
- `DELETE  /books/{id}` – Delete book by ID

## Notes
- This is a simple in-memory API (**no database**)
- Data resets when the application restarts  
