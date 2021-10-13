package com.nagarro.java.LibrarayApi.Book;

import java.time.LocalDate;

import javax.persistence.Id;



public class Books {
	
	@Id
	private int code;
	private String name;
	private String author;
	private LocalDate date;
	
	public Books() {
		
	}
	public Books(int code, String name, String author , LocalDate date) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
		this.date = date;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
