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
    private Book getBooks(@PathVariable("bookId") int id) {
        return bookService.getBookById(id);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBook(id);
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
