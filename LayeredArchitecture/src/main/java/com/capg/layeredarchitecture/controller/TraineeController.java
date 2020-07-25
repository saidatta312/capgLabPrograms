package com.capg.layeredarchitecture.controller;

import java.sql.SQLException;

import com.capg.layeredarchitecture.model.Student;
import com.capg.layeredarchitecture.service.TraineeService;
import com.capg.layeredarchitecture.service.TraineeServiceImpl;



public class TraineeController {

	TraineeService service;
	
	public TraineeController() throws SQLException {
	service=new TraineeServiceImpl();
	}
	
	public Student addTrainee(Student trainee) throws SQLException {
		return service.addTrainee(trainee);
	}
	
	
}