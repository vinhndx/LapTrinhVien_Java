package com.t3h.service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.t3h.entities.Book;
import com.t3h.util.EbookShopConstant;

@Stateless
@LocalBean
public class BookService implements BookServiceRemote, BookServiceLocal {
	
	@PersistenceContext(name="Mod4-Chap6-Demo")
	private EntityManager entityManager;
	
	@Override
	public List<Book> getAllBooks(){
		Query query = entityManager.createQuery("Select b from Book b");
		return query.getResultList();
	}
	
	@Override
	public List<Book> getBooksPaging(int page) {
		Query query = entityManager.createQuery("Select b from Book b");
		query.setMaxResults(EbookShopConstant.PAGING_SIZE);
		query.setFirstResult((page - 1) * EbookShopConstant.PAGING_SIZE);
		return query.getResultList();
	}
	
	@Override
	public List<Book> getAllBooksByAuthor(String author){
		Query query = entityManager.createQuery("Select b from Book b where b.author = :author");
		query.setParameter("author", author);
		return query.getResultList();
	}

	@Override
	public void inserBook(Book book) {
		entityManager.persist(book);
	}
	
	@Override
	public Book getBookById(int id) {
		Query query = entityManager.createQuery("select b From Book b where b.id = :id");
		query.setParameter("id", id);
		
		return (Book) query.getSingleResult();
		
	}

	@Override
	public void updateBook(Book book) {
		Book currentBook = entityManager.find(Book.class, book.getId());
//		Book currentBook = getBookById(book.getId());
		
		currentBook.setTitle(book.getTitle());
		currentBook.setPrice(book.getPrice());
		currentBook.setAuthor(book.getAuthor());
		
		entityManager.merge(currentBook);
		
	}

	@Override
	public void removeBook(Book book) {
		Book currentBook = entityManager.find(Book.class, book.getId());
		entityManager.remove(currentBook);
	}
	
	@Override
	public void removeBookById(int id) {
		Book currentBook = entityManager.find(Book.class, id);
		entityManager.remove(currentBook);
	}

	@Override
	public long getTotalBook() {
		Query query = entityManager.createQuery("select count(*) From Book b");
		return (long) query.getSingleResult();
	}
}
