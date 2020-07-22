package com.capg.layeredarchitecture.service;

import java.sql.SQLException;

import com.capg.layeredarchitecture.dao.TraineeDao;
import com.capg.layeredarchitecture.dao.TraineeDaoJdbcBasedImpl;
import com.capg.layeredarchitecture.model.Trainee;

public class TraineeServiceImpl implements TraineeService {
	
	TraineeDao dao;
	public TraineeServiceImpl() throws SQLException {
		dao=new TraineeDaoJdbcBasedImpl();
	}

	
	public Trainee addTrainee(Trainee trainee) throws SQLException {
		return dao.addTrainee(trainee);
		
	}

	
	public void deleteTrainee(int id) {
		// TODO Auto-generated method stub
		
	}


	public Trainee getTrainee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}