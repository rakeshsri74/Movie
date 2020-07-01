package com.iiht.utiltestclass;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.iiht.model.Movie;
import com.iiht.model.Multiplex;


public class MasterData {

	public static Movie getMovieDetails() {
		Movie movie = new Movie();
		movie.setMovieId(1);
		movie.setName("DDLJ");
		movie.setDirectedBy("Aditya Chopra");
		movie.setProducedBy("Yash Chopra");
		movie.setProduction("YashRaj Films");
		movie.setReleasedDate(new Date("12/12/1995"));
		return movie;
	}
	public static Movie getUpdateMovieDetails() {
		Movie movie = new Movie();
		movie.setMovieId(1);
		movie.setName("DDLJ");
		movie.setDirectedBy("Aditya Chopra");
		movie.setProducedBy("Yash Chopra");
		movie.setProduction("YashRaj Films");
		movie.setReleasedDate(new Date("12/12/1995"));
		return movie;
	}
	public static Multiplex getMultiplexDetails() {
		Multiplex multiplex = new Multiplex();
		multiplex.setMultiplexId(1);
		multiplex.setName("Fun Cinema");
		multiplex.setCity("Ghaziabad");
		multiplex.setState("UP");
		return multiplex;
	}
	public static Multiplex getUpdateMultiplexDetails() {
		Multiplex multiplex = new Multiplex();
		multiplex.setMultiplexId(1);
		multiplex.setName("Fun Cinema");
		multiplex.setCity("Ghaziabad");
		multiplex.setState("UP");
		return multiplex;
	}
	public static Properties getProperties() throws IOException {
		FileReader reader = new FileReader("src/main/resources/db.properties");
		Properties properties = new Properties();
		properties.load(reader);
		return properties;
	}
	
	public static LocalSessionFactoryBean getSession() throws IOException {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		Properties properties = getProperties();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(properties.getProperty("database.driver"));
		dataSource.setUrl(properties.getProperty("database.url"));
		dataSource.setUsername(properties.getProperty("database.root"));
		dataSource.setPassword(properties.getProperty("database.password"));
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan("com.iiht.model");
		properties.put("hibernate.dialect", properties.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
		lsfb.setHibernateProperties(properties);
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb;
	}
}
