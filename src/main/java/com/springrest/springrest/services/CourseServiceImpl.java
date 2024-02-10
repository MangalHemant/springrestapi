package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{


    List<Course> list;

    public CourseServiceImpl()
    {
        list=new ArrayList<>();
        list.add(new Course(145,"ReactJS","To Learn React"));
        list.add(new Course(150,"Springboot","To Learn Springboot"));
    }



    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long courseId) {
        Course reqCourse=null;

        for(Course course:list)
        {
            if(course.getId()==courseId)
            {
                reqCourse= course;
                break;
            }
        }
return reqCourse;
    }

    @Override
    public List<Course> addCourse(Course courseToAdd) {
        list.add(courseToAdd);
        return list;
    }

    @Override
    public void deleteCourse(Long courseId) {
        list=this.list.stream().filter(e -> e.getId()!=courseId).collect(Collectors.toList());
    }


    @Override
    public List<Course> updateCourse(Course courseToUpdate) {
        for(Course course:list)
        {
            if(course.getId()==courseToUpdate.getId())
            {

                course.setTitle(courseToUpdate.getTitle());
                course.setDescription(courseToUpdate.getDescription());
                break;
            }
        }
        return list;
    }
}
