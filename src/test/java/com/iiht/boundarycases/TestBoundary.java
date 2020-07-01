package com.iiht.boundarycases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.iiht.model.Movie;
import com.iiht.model.Multiplex;
import com.iiht.utiltestclass.MasterData;

public class TestBoundary {

	static {
		File file = new File("output_boundary_revised.txt");		
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testMovieLength() throws Exception {
		Movie movie = MasterData.getMovieDetails();
		//Set<ConstraintViolation<User>> violations = validator.validate(user);
		movie.getName();
		int maxChar = 15;
		boolean movienameLength = ((movie.getName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestMovieNameLength=" + (movienameLength ? true : false), true);
	}
	
	@Test
	public void testMultiplexLength() throws Exception {
		Multiplex multiplex = MasterData.getMultiplexDetails();
		//Set<ConstraintViolation<User>> violations = validator.validate(user);
		multiplex.getName();
		int maxChar = 15;
		boolean multiplexnameLength = ((multiplex.getName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestMultiplexNameLength=" + (multiplexnameLength ? true : false), true);
	}
}
