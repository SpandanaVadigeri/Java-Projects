package com.simpleproject.booksAPI.controller;

import com.simpleproject.booksAPI.model.Book;
import com.simpleproject.booksAPI.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books") // Base URL for all APIs in this controller
public class BookController {

    // Inject BookService using constructor injection
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // GET /books - Retrieve all books
    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    // GET /books/{bookId} - Retrieve a book by its ID
    @GetMapping("/{bookId}")
    public ResponseEntity<?> getBookById(@PathVariable int bookId) {
        Book book = bookService.getBookById(bookId);
        if (book != null) {
            return ResponseEntity.ok(book); // Return book if found
        } else {
            return ResponseEntity.status(404).body("Book with ID " + bookId + " not found.");
        }
    }

    // POST /books - Add a new book
    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.ok("Book added successfully!");
    }

    // PUT /books - Update a book
    @PutMapping
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        boolean updated = bookService.updateBook(book);
        return updated ? ResponseEntity.ok("Book updated successfully!") : ResponseEntity.notFound().build();
    }

    // DELETE /books/{bookId} - Delete a book by ID
    @DeleteMapping("/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable int bookId) {
        boolean deleted = bookService.deleteBook(bookId);
        return deleted ? ResponseEntity.ok("Book deleted successfully") : ResponseEntity.notFound().build();
    }
}
