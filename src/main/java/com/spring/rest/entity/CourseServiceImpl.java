package com.spring.rest.entity;

import DAO.CoursesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.CourseService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl  implements CourseService {
    @Autowired
    private CoursesDAO coursesDAO;
    public CourseServiceImpl(){
    }
    @Override
    public List<Courses> getCourses() {
        return coursesDAO.findAll();
    }

    @Override
    public Courses getCourse(long courseId) {
        return coursesDAO.getOne(courseId);
    }

    @Override
    public Courses addCourse(Courses courses) {
         coursesDAO.save(courses);
        return courses;
    }

    @Override
    public Courses updateCourse(Courses courses) {
        coursesDAO.save(courses);
       return courses;
    }

    @Override
    public void deleteCourse(long parseLong) {
        coursesDAO.deleteById(parseLong);
    }


}
