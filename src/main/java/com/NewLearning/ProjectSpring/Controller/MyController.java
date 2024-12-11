package com.NewLearning.ProjectSpring.Controller;
import com.NewLearning.ProjectSpring.Entity.Course;
import com.NewLearning.ProjectSpring.Services.CoursesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
  @Autowired         // This annotation used to create object CourseServicesImpl class and inject into courseservice  so that wew can automatically create object .
  //here use loose coupling so that easily use getCourse method.
  // here we implement interface class
  private CoursesServices coursesServicesOwn;

  //get the Course
  @GetMapping("/courses")
  public Integer getCourses() {
    return 1;
  }
//@GetMapping("/courses/courseID")
//  public Integer getCourse(@PathVariable String courseID)
//  {
//    //passed the String value "courseID" that converted into long and "this." used for currently indicating value.
//    return this.coursesServicesOwn.getCourse(Long.parseLong(courseID));
//
//  }
// @PostMapping("/courses")
//  public course addCourse(@RequestBody course course)
// {
//   return this.coursesServicesOwn.addCourse(course);
// }
}
