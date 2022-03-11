package com.springMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springMongo.entities.Course;

public interface CourseRepo extends MongoRepository<Course, Long> {

}
