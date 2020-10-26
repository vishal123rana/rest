package services;

import com.spring.rest.entity.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
    public Courses getCourse(long courseId);
    public Courses addCourse(Courses courses);
    public Courses updateCourse(Courses courses);
    public void deleteCourse(long parseLong);
}
