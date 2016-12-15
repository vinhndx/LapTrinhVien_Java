package com.t3h.service;

import java.util.List;

import javax.ejb.Remote;

import com.t3h.entities.Book;

@Remote
public interface BookServiceRemote {
	List<Book> getAllBooks();
	List<Book> getBooksPaging(int page);
	List<Book> getAllBooksByAuthor(String author);
	void inserBook(Book book);
	void updateBook(Book book);
	Book getBookById(int id);
	void removeBook(Book book);
	void removeBookById(int id);
	long getTotalBook();
}
