package com.student_microservice.entities;

public class Address {
	private String city;
	private String state;
	private int zip;
	private Integer stud_id;

	
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


	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public Integer getStud_id() {
		return stud_id;
	}


	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}

	public Address(String city, String state, int zip, Integer stud_id) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.stud_id = stud_id;
	}

	public Address() {
		
	}
	
	

}
