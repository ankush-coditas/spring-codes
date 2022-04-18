package com.example.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbc.model.Book;
import com.example.jdbc.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepository br;
	@Transactional
	@Override
	public int insertBook(Book b) {
		return br.insertBook(b);
	}
	@Transactional
	@Override
	public int updateBook(String bn, float p) {
		return br.updateBook(bn, p);
	}
	@Transactional
	@Override
	public void deleteBook(int bid) {
		br.deleteBook(bid);
	}
	@Transactional
	@Override
	public List<Book> getAllBooks() {
	
		return br.getAllBooks();
	}
	

}
