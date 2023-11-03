package com.spring.springrest.service;

import com.spring.springrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    Course getCourse(Long courseId);

    Course addCourse(Course course);
}
