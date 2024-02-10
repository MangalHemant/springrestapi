package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
}
