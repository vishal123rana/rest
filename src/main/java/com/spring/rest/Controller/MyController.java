package com.spring.rest.Controller;
import java.util.List;

import com.spring.rest.entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CourseService;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/home")
    public String home(){
        return "Welcome to courses application";
    }

    //get the courses
    @RequestMapping(path = "/courses",method = RequestMethod.GET)
    public List<Courses> getCourses(){
       return this.courseService.getCourses();
    }


    @GetMapping("/courses/{coursesId}")
    public Courses getCourse(@PathVariable  String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }


    @PostMapping("/courses")
    public Courses addCourses(@RequestBody Courses courses){
        return this.courseService.addCourse(courses);
    }



    @PutMapping("/courses")
    public Courses updateCourse(@RequestBody Courses course){
        return this.courseService.updateCourse(course);
    }



    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
