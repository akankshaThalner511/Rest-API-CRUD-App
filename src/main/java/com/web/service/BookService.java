package com.web.service;

import java.util.List;

import com.web.entity.Book;

public interface BookService {
	
	
	public String upsertBookJ(Book book);

	public List<Book> getAllBooks();
	
	// public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
}
