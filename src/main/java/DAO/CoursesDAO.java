package DAO;

import com.spring.rest.entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesDAO extends JpaRepository<Courses,Long> {

}
