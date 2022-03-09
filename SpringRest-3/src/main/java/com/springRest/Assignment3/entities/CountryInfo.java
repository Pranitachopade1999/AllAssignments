package com.springRest.Assignment3.entities;

public class CountryInfo {
	private String country;
	private String state;
	private String city;
	private long zipcode;
	public CountryInfo(String country, String state, String city, long zipcode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "CountryInfo [country=" + country + ", state=" + state + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
	

}
