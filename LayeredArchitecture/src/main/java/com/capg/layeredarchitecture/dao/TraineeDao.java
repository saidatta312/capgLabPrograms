package com.capg.layeredarchitecture.dao;

import java.sql.SQLException;

import com.capg.layeredarchitecture.model.Student;



public interface TraineeDao {

	public Student addTrainee(Student trainee) throws SQLException;
	public Student findTrainee(int id) throws SQLException;
	public void removeTrainee(int id) throws SQLException;
}