package org.campusyantra.dao.service;

import org.campusyantra.dto.Trainee;

public interface TraineeService {
	
	public boolean login(String userName, String password);
	
	public boolean register(Trainee trn);
	
	public boolean update(Trainee trn);
	
	public void getTraineeByEmail(String email);
	
	public boolean deleteProfile(String id);
	
	public boolean saveLoginDetails(String userName, String password);

}
