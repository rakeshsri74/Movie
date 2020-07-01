package com.iiht.dao;

import java.util.Map;

import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

public interface MultiplexDao {

	public boolean saveMultiplex(Multiplex multiplex);
	public Map<Multiplex,Movie> searchByMultiplexName(String name);
}
