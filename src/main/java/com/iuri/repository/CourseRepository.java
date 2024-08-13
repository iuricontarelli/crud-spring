package com.iuri.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuri.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
