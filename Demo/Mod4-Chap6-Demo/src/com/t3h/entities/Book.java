package com.t3h.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name="books")
@NamedQueries({@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b"),
	@NamedQuery(name="Book.getBookByAuthor", query="SELECT b FROM Book b")})

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String author;

	private float price;

	private int qty;

	private String title;

	public Book() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return this.qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}