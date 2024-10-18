package com.springrest.springrest.services;
import java.util.*;

import com.springrest.springrest.entities.Courses;


public interface Courseservice {

	public List<Courses> getCourses();
	
	public Courses getCourse(long courseid);
}
