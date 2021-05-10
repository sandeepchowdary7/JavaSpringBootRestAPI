package com.restjava.restjava.services;

import com.restjava.restjava.models.Book;
import com.restjava.restjava.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired BookRepository bookRepository;

    public List getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(book1 -> books.add(book1));
        return books;
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id).get();
    }

    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }

    public void saveOrUpdate(Book book) {
        bookRepository.save(book);
    }

    public void updateBook(Book book) {
        bookRepository.save(book);
    }
}
