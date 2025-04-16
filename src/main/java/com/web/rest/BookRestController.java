package com.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Book;
import com.web.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		String msg = service.upsertBookJ(book);
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> allBooks = service.getAllBooks();
		return new ResponseEntity<>(allBooks, HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		String msg = service.upsertBookJ(book);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/book")
	public ResponseEntity<String> deleteBook1(@RequestParam("bookId") Integer bookId){
		String msg = service.deleteBook(bookId);
		System.out.println(msg);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
