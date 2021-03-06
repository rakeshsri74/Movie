package com.iiht.dao;

import java.util.Map;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

public interface MovieDao {

	public boolean saveMovie(Movie movie);
	public Map<Movie,Multiplex> searchByMovieName(String name) throws ResourceNotFoundException;
	public boolean movieAllotment(String movie);
}
