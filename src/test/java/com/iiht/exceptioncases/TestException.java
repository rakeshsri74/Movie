package com.iiht.exceptioncases;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.iiht.exception.ResourceNotFoundException;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;
import com.iiht.service.MovieServiceImpl;
import com.iiht.service.MultiplexServiceImpl;

public class TestException {

	static {
		File file = new File("output_exception_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}

	@InjectMocks
	private MovieServiceImpl movieServiceImpl;

	@InjectMocks
	private MultiplexServiceImpl multiplexServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = ResourceNotFoundException.class)
	public void testForMovie() throws Exception {
		try {
			Movie movie = new Movie();
			movie.setMovieId(1);
			movie.setName("DDLJ");
			movie.setDirectedBy("Aditya Chopra");
			movie.setProducedBy("Yash Chopra");
			movie.setProduction("YashRaj Films");
			movie.setReleasedDate(new Date("12/12/1995"));
		    movieServiceImpl.saveMovie(movie);
		} catch (Exception e) {
			File file = new File("1.txt");
			FileUtils.write(file, "testForUserSignUp=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "testForMovie=false", true);
	}

	@Test(expected = ResourceNotFoundException.class)
	public void testForMultiplex() throws Exception {
		try {
			Multiplex multiplex = new Multiplex();
			multiplex.setMultiplexId(1);
			multiplex.setName("Fun Cinema");
			multiplex.setCity("Ghaziabad");
			multiplex.setState("UP");
			multiplexServiceImpl.saveMultiplex(multiplex);
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForMultiplex=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForMultiplex=false", true);
	}

}
