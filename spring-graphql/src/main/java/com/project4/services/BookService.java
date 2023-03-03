package com.project4.services;

import java.util.List;

import com.project4.entity.Book;

public interface BookService {
	
	//create
	Book create(Book book);
	
	//getAll
	List<Book> getAll();
	
	//get single book
	Book get(int bookId);

}
