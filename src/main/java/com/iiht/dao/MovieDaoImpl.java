package com.iiht.dao;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

@Repository("movieDao")
@Transactional(propagation= Propagation.REQUIRED)
public class MovieDaoImpl implements MovieDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		return false;
	}

	public Map<Movie, Multiplex> searchByMovieName(String name) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean movieAllotment(String movie) {
		// TODO Auto-generated method stub
		return false;
	}

}
