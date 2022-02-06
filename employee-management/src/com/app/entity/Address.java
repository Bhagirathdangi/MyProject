package com.app.entity;

public class Address {

	private int id;
	private String street;
	private String city;
	private String zip;
	private String state;
	private String  country;
    private  int emmp_id;
	public Address() {
		super();
	}
	public Address(int id, String street, String city, String zip, String state, String country, int emmp_id) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
		this.emmp_id = emmp_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getEmmp_id() {
		return emmp_id;
	}
	public void setEmmp_id(int emmp_id) {
		this.emmp_id = emmp_id;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", zip=" + zip + ", state=" + state
				+ ", country=" + country + ", emmp_id=" + emmp_id + "]";
	}
    
    
    
	
}
