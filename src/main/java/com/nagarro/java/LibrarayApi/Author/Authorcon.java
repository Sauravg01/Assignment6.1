package com.nagarro.java.LibrarayApi.Author;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



public class Authorcon {
	@Autowired
	private AurtherSer authorService;
	
	@RequestMapping("/authors")
	public List<Author> getAllAuthors(){
		return authorService.getAllAuthors();
	}
	
	@RequestMapping("/authors/{id}")
	public Optional<Author> getAuthor( @PathVariable int id) {
		return authorService.getAuthor(id);	
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/authors")
	public Author addAuthor(@RequestBody Author author) {
		return authorService.addAuthor(author);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/authors/{int}")
	public void updateAuthor(@RequestBody Author author , @PathVariable int id) {
		 authorService.updateAuthor(author);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/authors/{id}")
	public void deleteAuthor(@PathVariable int id) {
		authorService.deleteAuthor(id);
	}
}
