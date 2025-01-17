package com.bookstore.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bookstore.dto.BooksDto;
import com.bookstore.model.Books;

public interface iBooksService {
	
	public BooksDto getBook(int eCode);
	
	List<BooksDto> getBooks();
	
	BooksDto createBooks (BooksDto booksDto) throws Exception;
	
	ResponseEntity<Books> deleteBooks (int eCode);

	BooksDto updateEmployee(int bookId, BooksDto bookDto);

}
