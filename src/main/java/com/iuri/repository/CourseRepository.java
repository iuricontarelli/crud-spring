package com.iuri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iuri.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
