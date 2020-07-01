package com.iiht.dao;

import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

@Repository("multiplexDao")
@Transactional(propagation= Propagation.REQUIRED)
public class MultiplexDaoImpl implements MultiplexDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean saveMultiplex(Multiplex multiplex) {
		// TODO Auto-generated method stub
		return false;
	}

	public Map<Multiplex, Movie> searchByMultiplexName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
