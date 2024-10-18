package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.Courseservice;

@RestController
public class MyController {

	@Autowired
	private Courseservice courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application.";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
	
		return this.courseservice.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseservice.getCourse(Long.parseLong(courseId));
	}
}
