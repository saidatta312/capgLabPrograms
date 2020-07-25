package com.capg.layeredarchitecture.service;

import java.sql.SQLException;

import com.capg.layeredarchitecture.model.Student;



public interface TraineeService {
	
	public Student addTrainee(Student trainee) throws SQLException;
	public void deleteTrainee(int id)throws SQLException;
	public Student getTrainee(int id)throws SQLException;

}