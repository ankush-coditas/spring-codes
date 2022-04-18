package com.example.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.model.Book;
import com.example.jdbc.service.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping(path="/save")
	public String saveController(@RequestBody Book b) {
		int i=bookService.insertBook(b);
		if(i>0)
			return "Record added Successfully";
		else
			return "Try Again";
	}
	
	@DeleteMapping(path="delete/{id}")
	public String deleteController(@PathVariable int id) {
		bookService.deleteBook(id);
		return "Data deleted Successfully";
	}
	
	@GetMapping(path="getAllBooks")
	public List<Book> fetchController(){
		return bookService.getAllBooks();
	}
	
}
