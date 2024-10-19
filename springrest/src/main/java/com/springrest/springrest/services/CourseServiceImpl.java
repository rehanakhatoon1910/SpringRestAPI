package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImpl implements Courseservice {

	List<Courses> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses(145,"Java Core Course","this is java course"));
		list.add(new Courses(146,"Spring boot course","this is spring boot course"));
		list.add(new Courses(147,"Python Course","this is python course"));
	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	public Courses getCourse(long courseId) {
		Courses c= null;
		for(Courses course:list) {
			if(course.getId()==courseId) {
				c=course;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		
			list.add(course);
			return course;
		
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
//		if(list.contains(course.getId())){
////		   if(course.getTitle().equalsIgnoreCase(null))
//			list.set(list.indexOf(course.getId()), course);
//		}
		
		list.add(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		list.remove(courseId);
		System.out.println("The course with id:"+courseId+" was removed.");
	}

}
