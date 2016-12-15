package com.apt.web.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the apt_movie_category database table.
 * 
 */
@Entity
@Table(name="apt_movie_category")
@NamedQuery(name="AptMovieCategory.findAll", query="SELECT a FROM AptMovieCategory a")
public class AptMovieCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String name;

	//bi-directional many-to-one association to AptMovie
	@OneToMany(mappedBy="aptMovieCategory")
	private List<AptMovie> aptMovies;

	public AptMovieCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AptMovie> getAptMovies() {
		return this.aptMovies;
	}

	public void setAptMovies(List<AptMovie> aptMovies) {
		this.aptMovies = aptMovies;
	}

	public AptMovie addAptMovy(AptMovie aptMovy) {
		getAptMovies().add(aptMovy);
		aptMovy.setAptMovieCategory(this);

		return aptMovy;
	}

	public AptMovie removeAptMovy(AptMovie aptMovy) {
		getAptMovies().remove(aptMovy);
		aptMovy.setAptMovieCategory(null);

		return aptMovy;
	}

}