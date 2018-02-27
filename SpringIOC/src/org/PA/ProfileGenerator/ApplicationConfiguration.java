package org.PA.ProfileGenerator;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
//import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ApplicationConfiguration {

	//private Environment env;

	@Bean
	public JdbcTemplate getJdbcTemplate() {

		JdbcTemplate template = new JdbcTemplate(getDataSouce());
		return template;
	}

	@Bean
	@Profile("dev")
	public DataSource getDataSouce() {
		DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/javatraining",
				"root", "241194@Cha");
		
		return datasource;
	}
	
	@Bean
	@Profile("prod")
	public DataSource getDataSouceProd() {
		DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://ProdUrl:3306/javatraining",
				"ProdUserName", "ProdPassword");
		
		return datasource;
	}

}
