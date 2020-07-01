package com.iiht.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.MovieDao;
import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

@Service("movieService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDao movieDao;
	
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
