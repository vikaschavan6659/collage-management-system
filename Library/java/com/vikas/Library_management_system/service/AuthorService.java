package com.vikas.Library_management_system.service;

import java.util.List;

import com.vikas.Library_management_system.entity.Author;


public interface AuthorService {

	public List<Author> findAllAuthors();

	public Author findAuthorById(Long id);

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

}
