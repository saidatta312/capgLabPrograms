package com.capg.layeredarchitecture.service;

import java.sql.SQLException;

import com.capg.layeredarchitecture.dao.TraineeDao;
import com.capg.layeredarchitecture.dao.TraineeDaoJdbcBasedImpl;
import com.capg.layeredarchitecture.model.Student;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeDao dao;
	public TraineeServiceImpl() throws SQLException {
		dao=new TraineeDaoJdbcBasedImpl();
	}

	
	public Student addTrainee(Student trainee) throws SQLException {
		return dao.addTrainee(trainee);
		
	}

	
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		
	}


	public Student getTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}