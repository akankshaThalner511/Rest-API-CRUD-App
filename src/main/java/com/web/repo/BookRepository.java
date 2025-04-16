package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {
	
	
	

}
