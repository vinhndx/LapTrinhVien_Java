package com.apt.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the apt_movie database table.
 * 
 */
@Entity
@Table(name="apt_movie")
@NamedQuery(name="AptMovie.findAll", query="SELECT a FROM AptMovie a")
public class AptMovie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String duration;

	private String image;

	private String name;

	@Column(name="public_year")
	private int publicYear;

	private Double rating;

	//bi-directional many-to-one association to AptMovieCategory
	@ManyToOne
	@JoinColumn(name="category_id")
	private AptMovieCategory aptMovieCategory;

	public AptMovie() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublicYear() {
		return this.publicYear;
	}

	public void setPublicYear(int publicYear) {
		this.publicYear = publicYear;
	}

	public Double getRating() {
		return this.rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public AptMovieCategory getAptMovieCategory() {
		return this.aptMovieCategory;
	}

	public void setAptMovieCategory(AptMovieCategory aptMovieCategory) {
		this.aptMovieCategory = aptMovieCategory;
	}

}