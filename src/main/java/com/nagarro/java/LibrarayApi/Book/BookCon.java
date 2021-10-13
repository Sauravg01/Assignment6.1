package com.nagarro.java.LibrarayApi.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookCon {
	@Autowired
	private BooksServ bookService;
	
	@RequestMapping("/books")
	public List<Books> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@RequestMapping("/books/{code}")
	public Optional<Books> getBook( @PathVariable int code) {
		return bookService.getBook(code);	
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/books")
	public Books addBook(@RequestBody Books book) {
		return bookService.addBook(book);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/books/{code}")
	public void updateBook(@RequestBody Books book , @PathVariable int code) {
		 bookService.updateBook(code, book);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/books/{code}")
	public void deleteBook(@PathVariable int code) {
		bookService.deleteBook(code);
	}
}
