package com.capg.layeredarchitecture.service;

import java.sql.SQLException;

import com.capg.layeredarchitecture.model.Trainee;



public interface TraineeService {
	
	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public void deleteTrainee(int id)throws SQLException;
	public Trainee getTrainee(int id)throws SQLException;

}