package com.iiht.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.dao.MultiplexDao;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;

@Service("multiplexService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class MultiplexServiceImpl implements MultiplexService {

	@Autowired
	private MultiplexDao multiplexDao;
	
	public boolean saveMultiplex(Multiplex multiplex) {
		// TODO Auto-generated method stub
		return false;
	}

	public Map<Multiplex, Movie> searchByMultiplexName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
