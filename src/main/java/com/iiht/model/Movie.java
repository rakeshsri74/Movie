package com.iiht.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MovieMaster")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MovieId")
	private int movieId;
	@Column(name = "MovieName")
	private String name;
	@Column(name = "DirectedBy")
	private String directedBy;
	@Column(name = "ProducedBy")
	private String producedBy;
	@Column(name = "Production")
	private String production;
	@Column(name = "ReleasedDate")
	private Date releasedDate;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirectedBy() {
		return directedBy;
	}
	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}
	public String getProducedBy() {
		return producedBy;
	}
	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public Date getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}
	
	
	
}
