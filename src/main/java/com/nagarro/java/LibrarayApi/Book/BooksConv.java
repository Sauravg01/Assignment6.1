package com.nagarro.java.LibrarayApi.Book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class BooksConv {
	public BooksDTO toBookDto(Books book) {

		BooksDTO bookDto = new BooksDTO(book.getCode(), book.getName(), book.getAuthor(),
			book.getDate().toString());
		return bookDto;
	}


	public Books toBook(BooksDTO bookDto) {
		LocalDate doc = LocalDate.parse(bookDto.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		Books book = new Books(bookDto.getCode(), bookDto.getName(), bookDto.getAuthor(), doc);
		return book;
	}
}
