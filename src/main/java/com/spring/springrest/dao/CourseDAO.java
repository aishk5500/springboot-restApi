package com.spring.springrest.dao;

import com.spring.springrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDAO extends JpaRepository<Course,Long> {

}
