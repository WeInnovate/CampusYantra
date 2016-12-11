package org.campusyantra.dao.util;

import org.campusyantra.dao.service.TraineeService;
import org.campusyantra.dao.service.impl.TraineeServiceImpl;

public class DAOFactory {

	public static TraineeService getTraineeService(){
		return new TraineeServiceImpl();
	}
}
