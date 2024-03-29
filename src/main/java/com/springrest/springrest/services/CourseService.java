package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(Long courseId);

    public List<Course> addCourse(Course courseToAdd);

    public void deleteCourse(Long courseId);

    public List<Course> updateCourse(Course courseToUpdate);
}
