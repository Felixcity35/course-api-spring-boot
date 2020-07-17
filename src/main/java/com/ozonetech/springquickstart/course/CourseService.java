package com.ozonetech.springquickstart.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository ;
	
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses ;
	}
	
	public Course getCourses(String id) {
		
		return courseRepository.findById(id).get();
		
	// use optional in java 8 instead.
		
	}

	public void addCourses(Course courses) {
		
		courseRepository.save(courses);
	}

	public void updateCourses( Course courses) {
		
		courseRepository.save(courses);
		
	}

	public void deleteCourses(String id) {
		courseRepository.deleteById(id);
		
	}

}

