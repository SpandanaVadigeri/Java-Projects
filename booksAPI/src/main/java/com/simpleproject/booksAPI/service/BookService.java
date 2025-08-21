// service class to manage book-related operations
package com.simpleproject.booksAPI.service;

import com.simpleproject.booksAPI.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    //In-memory list of books

    private final List<Book> books = new ArrayList<>(Arrays.asList(
            new Book(1001, "Computer Organization and Design", "David A " , 550.00F),
            new Book(1002, "Data Structures and Algorithms in Java", "Robert Lafore" , 550.00F),
            new Book(1003, "Computer Fundamentals", "P.K. Sinha" , 550.00F),
            new Book(1004, "Operating System Concepts", "Galvin" , 550.00F),
            new Book(1005, "Database System Concepts", "Silberschatz" , 550.00F)
    ));

    // Return all the books
    public List<Book> getBooks(){
        return books;
    }

    //Return a specific book by ID
    public Book getBookById(int bookId){
        return books.stream().filter(b->b.getBookId() == bookId).findFirst().orElse(null);
    }

    //Add a new book to the list
    public void addBook(Book book){
        books.add(book);
    }

    //Update an existing book by matching its ID
    public boolean updateBook(Book book){
        for(int i = 0;i<books.size();i++){
            if(books.get(i).getBookId() == book.getBookId()){
                books.set(i,book);
                return true;
            }
        }
        return false;
    }

    //Delete a book by ID
    public boolean deleteBook(int bookId){
        return books.removeIf(b->b.getBookId() == bookId);
    }

}