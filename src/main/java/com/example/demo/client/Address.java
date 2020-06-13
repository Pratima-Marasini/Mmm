package com.example.demo.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String country;
	private String city;
	private String street;
	private int homeNumber;
	
	
	protected Address() {}


	public Address(String country, String city, String street, int homeNumber) {
		this.country = country;
		this.city = city;
		this.street = street;
		this.homeNumber = homeNumber;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", city=" + city + ", street=" + street + ", homeNumber="
				+ homeNumber + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getHomeNumber() {
		return homeNumber;
	}


	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	
	
	

}
