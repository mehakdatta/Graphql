package com.project4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project4.entity.Book;
import com.project4.services.BookService;

@SpringBootApplication
public class SpringGraphqlApplication implements CommandLineRunner{

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1=new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("Learn java here");
		b1.setAuthor("XYZ");
		b1.setPages(300);
		b1.setPrice(2000);
		
		Book b2=new Book();
		b2.setTitle("Let Us C");
		b2.setDesc("Learn C here");
		b2.setAuthor("ABC");
		b2.setPages(500);
		b2.setPrice(3000);
		
		this.bookService.create(b1);
		this.bookService.create(b2);
		
		
		
	}

}
