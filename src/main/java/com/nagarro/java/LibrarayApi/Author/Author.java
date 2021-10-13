package com.nagarro.java.LibrarayApi.Author;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Author {
	@Id
	private int id;
	private String firstName;
	private String listName;
	
	public Author() {
		
	}

	public Author(String firstName, String listName) {
		super();
		this.firstName = firstName;
		this.listName = listName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}
}
