package com.spring.springrest.service;

import com.spring.springrest.entity.Course;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list=new ArrayList<>();

    private List<Course> getList(){
        list=new ArrayList<>();
        list.add(new Course(145, "java","this is desc"));
        list.add(new Course(22,"java2","desc2"));
        return list;
    }
    @Override
    public List<Course> getCourses() {
        return getList();
    }

    @Override
    public Course getCourse(Long courseId) {
        Course c = null;
        list=getList();
        for (Course course:list) {
            if(course.getId()== courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        getList().add(course);
        return course;
    }
}
