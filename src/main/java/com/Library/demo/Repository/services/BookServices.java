package com.Library.demo.Repository.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Library.demo.Repository.BookRepository;
import com.Library.demo.entity.Book;
@Service
@Transactional
public class BookServices {
    @Autowired
    private BookRepository bookrepository;
  
    public List<Book> listall(){
    	List<Book> booklist = bookrepository.findAll();
    	return booklist;
    }
    public void addbook(Book book) {
    	bookrepository.save(book);
    }
    public Book getid(int id) throws Exception {
    	return bookrepository.findById(id).orElseThrow(()-> new Exception("invalid id"));
    }
    public void delete(int id) {
    	bookrepository.deleteById(id);
    }
  
}
