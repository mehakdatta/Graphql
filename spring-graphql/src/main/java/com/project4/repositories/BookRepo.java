package com.project4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project4.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
