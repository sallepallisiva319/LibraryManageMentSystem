package com.Library.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Library.demo.Repository.services.BookServices;
import com.Library.demo.entity.Book;
@RestController
@RequestMapping("/book")
public class BookController {
   @Autowired
   private BookServices bookservices;
   
   @GetMapping("/view")
	   public ModelAndView getView() {
		  ModelAndView model= new ModelAndView("ViewDetails");
		  return model;
	   }
   
   
   @GetMapping("/")
   public ModelAndView retrivedata() {
	   ModelAndView model = new ModelAndView("bookdata");
	   List<Book> booklist = bookservices.listall();
	   model.addObject("booklist", booklist);
	   return model;
   }
    @GetMapping("/newbook")
    public ModelAndView addBook() {
    	ModelAndView model = new ModelAndView("add_newbook");
    	Book book = new Book();
    	model.addObject("book", book);
    	return model;
    }
    @GetMapping("/save")
    public ModelAndView saveaddingbook(@ModelAttribute("book") Book book) {
    	ModelAndView model = new ModelAndView("redirect:/book/");
    	bookservices.addbook(book);
    	return model;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView eidtById(@PathVariable("id") int id) throws Exception {
    	ModelAndView model = new ModelAndView("Edit_bookDetails");
    	Book book = bookservices.getid(id);
    	model.addObject("book", book);
    	return model;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deletebook(@PathVariable("id") int id) {
    	ModelAndView model = new ModelAndView("redirect:/book/");
    	bookservices.delete(id);
    	return model;
    }
}
