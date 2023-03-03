package com.project4.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.entity.Book;
import com.project4.repositories.BookRepo;
import com.project4.services.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepo bookRepo;
	
	@Autowired
	public BookServiceImpl(BookRepo bookRepo) {
//		super();
		this.bookRepo = bookRepo;
	}

	@Override
	public Book create(Book book) {
		// TODO Auto-generated method stub
		return this.bookRepo.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return this.bookRepo.findAll();
	}

	@Override
	public Book get(int bookId) {
		// TODO Auto-generated method stub
		return this.bookRepo.findById(bookId).orElseThrow(()->new RuntimeException("BOOK NOT FOUND"));
	}

}
