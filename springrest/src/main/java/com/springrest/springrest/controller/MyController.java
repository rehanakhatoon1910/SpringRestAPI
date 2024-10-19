package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course) {
		return this.courseservice.addCourse(course);
	}
	
	@PutMapping("/courses/{courseId}")
	public Courses updateCourse(@RequestBody Courses course) {
		return this.courseservice.updateCourse(course);
	}
	
	
	@DeleteMapping("/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		System.out.println("tetsing delete mapping");
		this.courseservice.deleteCourse(Long.parseLong(courseId));
	}
}
