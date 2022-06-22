package com.assign.assign9rest.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assign.assign9rest.Dao.AuthorsRepository;
import com.assign.assign9rest.model.Authors;





@RestController
public class AuthorController {
	
	@Autowired
	AuthorsRepository authorsRepository;
	
	@PostMapping(path ="/author", consumes = {"application/json"})
	public Authors author(@RequestBody Authors author) {
		authorsRepository.save(author);
		return author;
	}

	@GetMapping("/author")
	public Iterable<Authors> getAllauthor() {
		return authorsRepository.findAll();
	}
	
	@GetMapping("/author/{Id}")
	public Optional<Authors> getAuthor(@PathVariable("Id") int id ) {
		return authorsRepository.findById(id);
	}
	
	@DeleteMapping("/author/{Id}")
	public String deleteAuthor(@PathVariable("Id") int id) {
		@SuppressWarnings("deprecation")
		Authors author= authorsRepository.getById(id);
		authorsRepository.delete(author);
		return "Deleted";
	}
	
	@PutMapping(path ="/author", consumes = {"application/json"})
	public Authors saveorupdate(@RequestBody Authors author) {
		authorsRepository.save(author);
		return author;
	}
}