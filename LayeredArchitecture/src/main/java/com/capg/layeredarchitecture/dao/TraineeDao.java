package com.capg.layeredarchitecture.dao;

import java.sql.SQLException;

import com.capg.layeredarchitecture.model.Trainee;



public interface TraineeDao {

	public Trainee addTrainee(Trainee trainee) throws SQLException;
	public Trainee findTrainee(int id) throws SQLException;
	public void removeTrainee(int id) throws SQLException;
}