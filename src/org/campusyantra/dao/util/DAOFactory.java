package org.campusyantra.dao.util;

import org.campusyantra.dao.service.CourseService;
import org.campusyantra.dao.service.TraineeService;
import org.campusyantra.dao.service.impl.CourseServiceImpl;
import org.campusyantra.dao.service.impl.TraineeServiceImpl;

public class DAOFactory {

	public static TraineeService getTraineeService(){
		return new TraineeServiceImpl();
	}
	
	public static CourseService getCourseService(){
		return new CourseServiceImpl();
	}
}
