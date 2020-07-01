package com.iiht.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MultiplexMaster")
public class Multiplex {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MultiplexId")
	private int multiplexId;
	@Column(name = "Name")
	private String name;
	@Column(name = "City")
	private String city;
	@Column(name = "State")
	private String state;
	public int getMultiplexId() {
		return multiplexId;
	}
	public void setMultiplexId(int multiplexId) {
		this.multiplexId = multiplexId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
