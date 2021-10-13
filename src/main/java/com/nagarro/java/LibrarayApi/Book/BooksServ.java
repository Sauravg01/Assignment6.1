package com.nagarro.java.LibrarayApi.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BooksServ {
	@Autowired
	private BooksRepo bookRepository;
	
	
	public List<Books> getAllBooks(){
		
		List<Books> books = new ArrayList<>();

		bookRepository.findAll().forEach(books::add);
		return books;
	}
	
	public  Optional<Books> getBook(int code) {

		
		return bookRepository.findById(code);
	}

	public Books addBook(Books book) {

		
		bookRepository.save(book);
		return book;
	}
	
	public void updateBook(int code , Books book) {

		bookRepository.save(book);
	}

	public void deleteBook(int code) {

		
		bookRepository.deleteById(code);
}
}
