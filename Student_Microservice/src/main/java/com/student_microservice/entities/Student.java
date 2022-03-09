package com.student_microservice.entities;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private Integer stud_id;
	private String name,email;
    //private List<Address> address=new ArrayList<>();
    private Address address;
	public Integer getStud_id() {
		return stud_id;
	}
	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student(Integer stud_id, String name, String email, Address address) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public Student(Integer stud_id, String name, String email) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.email = email;
	}
	
	

}
