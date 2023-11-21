package com.spring.springrest.service;

import com.spring.springrest.dao.CourseDAO;
import com.spring.springrest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{
//    List<Course> list=new ArrayList<>();
    @Autowired
    private CourseDAO courseDAO;
//    private List<Course> getList(){
//        return courseDAO.findAll();
//        list=new ArrayList<>();
//        list.add(new Course(145, "java","this is desc"));
//        list.add(new Course(22,"java2","desc2"));
//        return list;
//    }
    @Override
    public List<Course> getCourses() {
//        return getList();
        return courseDAO.findAll();
    }

    @Override
    public Course getCourse(Long courseId) {
//        Course c = null;
//        list=getList();
//        for (Course course:list) {
//            if(course.getId()== courseId){
//                c=course;
//                break;
//            }
//        }
//        return c;
        return courseDAO.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
//        getList().add(course);
//        return course;
        return  courseDAO.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
//        list=getList();
//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDesc(course.getDesc());
//            }
//        });
//        return course;
       return courseDAO.save(course);
    }

    @Override
    public void deleteCourse(int i) {
//        list=getList();
//        list=this.list.stream().filter(e->e.getId()!=i).collect(Collectors.toList());
     courseDAO.deleteById((long) i);
    }
}
