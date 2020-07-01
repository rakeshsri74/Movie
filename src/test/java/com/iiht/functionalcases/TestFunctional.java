package com.iiht.functionalcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.iiht.dao.MovieDao;
import com.iiht.dao.MultiplexDao;
import com.iiht.model.Movie;
import com.iiht.model.Multiplex;
import com.iiht.service.MovieServiceImpl;
import com.iiht.service.MultiplexServiceImpl;
import com.iiht.utiltestclass.MasterData;

public class TestFunctional {

	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
		
		@Mock
		private MovieDao movieDao;
		@Mock
		private MultiplexDao multiplexDao;

		@Mock
		private Movie movie;
		@Mock
		private Multiplex multiplex;
		

		@InjectMocks
		private MovieServiceImpl movieServiceImpl;
		@InjectMocks
		private MultiplexServiceImpl multiplexServiceImpl;
		
		@Before
		public void init() {
			MockitoAnnotations.initMocks(this);
		}

		@Test
		public void testSaveMovie() throws Exception {
			Boolean value = movieServiceImpl.saveMovie(MasterData.getMovieDetails());
			File file = new File("output_revised.txt");
		    FileUtils.write(file, "\ntestSaveMovies="+(value?true:false), true); 
		}
		
		@Test
		public void testSaveMultiplex() throws Exception {
			Boolean value = multiplexServiceImpl.saveMultiplex(MasterData.getMultiplexDetails());
			File file = new File("output_revised.txt");
		    FileUtils.write(file, "\ntestSaveMultiplex="+(value?true:false), true); 
		}
		
		@Test
		public void testMovieAllotment() throws Exception {
			Boolean value = movieServiceImpl.movieAllotment(MasterData.getMovieDetails().getName());
			File file = new File("output_revised.txt");
		    FileUtils.write(file, "\ntestMovieAllot="+(value?true:false), true); 
		}
		
}