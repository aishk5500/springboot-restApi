package com.spring.springrest.controller;

import com.spring.springrest.entity.Course;
import com.spring.springrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses")
    public List<Course> getCourses(){
       return this.courseService.getCourses();
    }
    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/Courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
    @PutMapping("/Course")
    public Course UpdateCourse(@RequestBody Course course){
        return  this.courseService.updateCourse(course);
    }
    @DeleteMapping("/Courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Integer.parseInt(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
