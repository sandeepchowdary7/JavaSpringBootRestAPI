package com.restjava.restjava.controllers;

import com.restjava.restjava.models.Book;
import com.restjava.restjava.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    private Object getBooks(@PathVariable("bookId") int id) {
        try {
            return bookService.getBookById(id);
        } catch (Exception e) {
            return "No Records Found with this id " + id;
        }
    }

    @DeleteMapping("/book/{bookId}")
    private Object deleteBook(@PathVariable("bookId") int id) {
        try {
            return bookService.getBookById(id);
        } catch (Exception e) {
            return "No Records Found with this id " + id;
        }
    }

    @PostMapping("/book")
    private int saveBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book.getId();
    }

    @PutMapping("/book")
    private Book updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
        return book;
    }
}
