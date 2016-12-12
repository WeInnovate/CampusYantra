package org.campusyantra.dao.service;

import java.util.List;

import org.campusyantra.dto.Course;

public interface CourseService {
	
	public List<Course> getAllModules();
	
	public List<List<String>> getEnrlModules(String userName);
}
