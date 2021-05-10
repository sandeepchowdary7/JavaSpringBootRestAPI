package com.restjava.restjava.repository;

import com.restjava.restjava.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
