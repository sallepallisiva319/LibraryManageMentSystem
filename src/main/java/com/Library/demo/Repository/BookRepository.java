package com.Library.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Library.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
