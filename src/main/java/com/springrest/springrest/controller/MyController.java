package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private CourseService CourseService;



    //Get the coursers
    @GetMapping("/courses")
    public List<Course> getCourses()
    {
      return this.CourseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId )
    {
        return this.CourseService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public List<Course> addCourse(@RequestBody Course courseToAdd)
    {
        return this.CourseService.addCourse(courseToAdd);
    }

    @GetMapping("/courses/delete/{courseId}")
    public List<Course> deleteCourse(@PathVariable String courseId)
    {
        return this.CourseService.deleteCourse(Long.parseLong(courseId));
    }

    @PutMapping("/courses/update")
    public List<Course> updateCourses(@RequestBody Course courseToUpdate)
    {
        return this.CourseService.updateCourse(courseToUpdate);
    }
}
