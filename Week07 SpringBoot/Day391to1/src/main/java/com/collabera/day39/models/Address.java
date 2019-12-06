package com.collabera.day39.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "addresses")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "address_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(columnDefinition = "varchar(255) default 'N/A'")
	private String street;
	
	@Column(columnDefinition = "varchar(255) default 'Unknown'")
	private String city;
	
	@Column(columnDefinition = "char(2) default '--'")
	private String state;
	
	@Column(columnDefinition = "char(5) default '00000'")
	private String zip;
	
	@OneToOne(mappedBy = "address")
	private Person person;
	
	public Address() {
		this(-1L, null, null, null, null);
	}

	public Address(Long id, @NotBlank String street, @NotBlank String city, String state, String zip) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ "]";
	}
}
