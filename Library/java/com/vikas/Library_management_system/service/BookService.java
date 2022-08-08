package com.vikas.Library_management_system.service;

import java.util.List;

import com.vikas.Library_management_system.entity.Book;


public interface BookService {

	public List<Book> findAllBooks();
	
	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);

}
