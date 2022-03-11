package com.springMongo.entities;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Course")
public class Course {

private	long Id;
private String title;
private String description;
public Course(long id, String title, String description) {
	super();
	Id = id;
	this.title = title;
	this.description = description;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return Id;
}
public void setId(long id) {
	Id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "Course [Id=" + Id + ", title=" + title + ", description=" + description + "]";
}


	
}
